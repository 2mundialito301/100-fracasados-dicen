import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Game {
    private static final int MAX_FAILURES = 3;
    private List<Question> questions;
    private GameWindow window;
    private int currentQuestionIndex;
    private int failures;
    private int totalPoints;
    private int totalHits;
    private int totalFailures;
    private boolean waitingNextQuestion;
    private boolean gameFinished;
    

    public void start(List<Question> questions) {
        this.questions = new ArrayList<>(questions);
        Collections.shuffle(this.questions);
        window = new GameWindow();
        window.setSubmitHandler(this::handleAnswer);
        window.setCloseHandler(this::finishGame);
        currentQuestionIndex = 0;
        showCurrentQuestion();
        window.showWindow();
    }

    private void handleAnswer(String userAnswer) {
        if (waitingNextQuestion) {
            currentQuestionIndex++;
            if (currentQuestionIndex >= questions.size()) {
                finishGame();
            } else {
                failures = 0;
                waitingNextQuestion = false;
                showCurrentQuestion();
            }
            return;
        }

        if (userAnswer.isBlank()) return;

        Question question = questions.get(currentQuestionIndex);
        Answer answer = question.findUnrevealedMatch(userAnswer);

        if (answer == null) {
            failures++;
            totalFailures++;
        } else {
            answer.reveal();
            totalPoints += answer.getPoints();
            totalHits++;
        }

        if (question.isComplete() || failures >= MAX_FAILURES) waitingNextQuestion = true;
        updateDisplay();
    }

    private void showCurrentQuestion() {
        failures = 0;
        updateDisplay();
    }

    private void updateDisplay() {
        Question question = questions.get(currentQuestionIndex);
        boolean revealAll = waitingNextQuestion && !question.isComplete();
        StringBuilder text = new StringBuilder();
        String separator = "-- * -- * -- * -- * -- * -- * -- * --";

        text.append(separator).append("\n");
        text.append(question.getPrompt()).append("\n");
        text.append(separator).append("\n");

        int index = 1;
        for (Answer answer : question.getAnswers()) {
            if (answer.isRevealed() || revealAll) {
                text.append(index).append(". ").append(answer.getText()).append(" --- ")
                        .append(answer.getPoints()).append(" pts\n");
            } else {
                text.append(index).append(". --- --- ---\n");
            }
            index++;
        }

        text.append(separator).append("\n");
        text.append("PUNTOS: ").append(totalPoints)
                .append(" | ACIERTOS: ").append(totalHits)
                .append(" | FALLOS: ").append(failures).append("/").append(MAX_FAILURES);

        if (waitingNextQuestion) {
            text.append("\n\n");
            text.append(question.isComplete() ? "PREGUNTA COMPLETADA" : "PREGUNTA PERDIDA");
            text.append("\nPresiona Enter para continuar.");
            window.updateDisplay(text.toString(), "Presiona Enter para continuar:");
        } else {
            window.updateDisplay(text.toString(), "Escribe tu respuesta y presiona Enter:");
        }
    }

    private void finishGame() {
        if (gameFinished) return;
        gameFinished = true;

        window.closeWindow();

        String summary = "PARTIDA FINALIZADA\n\n"
                + "Puntos obtenidos: " + totalPoints + "\n"
                + "Aciertos: " + totalHits + "\n"
                + "Fallos: " + totalFailures;

        JOptionPane.showMessageDialog(null, summary, "Resultado de la partida", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
