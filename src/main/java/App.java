
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        Path questionsFile = Path.of("data", "preguntas.txt");

        try {
            List<Question> questions = QuestionReader.readQuestions(questionsFile.toString());
            SwingUtilities.invokeLater(() -> new Game().start(questions));
        } catch (IOException exception) {
            System.err.println("No se pudieron cargar las preguntas: " + exception.getMessage());
            System.err.println("Comprueba que exista el archivo: " + questionsFile.toAbsolutePath());
            exception.printStackTrace();
        }
    }
}