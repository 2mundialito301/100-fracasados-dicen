import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QuestionReader {
    public static List<Question> readQuestions(String filePath) throws IOException {
        List<Question> questions = new ArrayList<>();
        List<String> lines = Files.readAllLines(Path.of(filePath), StandardCharsets.UTF_8);
        List<Answer> answers = new ArrayList<>();
        String prompt = null;
        int questionId = 1;
        int lineNumber = 0;

        for (String line : lines) {
            lineNumber++;
            line = line.trim();

            if (line.isEmpty()) continue;

            if (line.startsWith("[") && line.endsWith("]")) {
                if (prompt != null) {
                    if (answers.isEmpty()) throw new IOException("La pregunta " + questionId + " no tiene respuestas.");
                    questions.add(new Question(questionId++, prompt, answers));
                }

                prompt = line.substring(1, line.length() - 1).trim();
                answers = new ArrayList<>();
                continue;
            }

            if (prompt == null) throw new IOException("Hay una respuesta antes de la primera pregunta. Línea: " + lineNumber);

            int pointsStart = line.lastIndexOf('(');
            if (pointsStart == -1 || !line.endsWith(")")) {
                throw new IOException("Formato incorrecto en la línea " + lineNumber + ": faltan los puntos entre paréntesis.");
            }

            String answerData = line.substring(0, pointsStart).trim();
            String pointsData = line.substring(pointsStart + 1, line.length() - 1).trim();

            try {
                int points = Integer.parseInt(pointsData);
                String[] forms = answerData.split(";");
                String answerText = forms[0].trim();
                List<String> acceptedForms = new ArrayList<>();

                for (int i = 1; i < forms.length; i++) {
                    if (!forms[i].isBlank()) acceptedForms.add(forms[i].trim());
                }

                if (answerText.isEmpty()) throw new IllegalArgumentException();

                answers.add(new Answer(answerText, points, acceptedForms));
            } catch (IllegalArgumentException exception) {
                throw new IOException("Datos inválidos en la línea " + lineNumber + ".", exception);
            }
        }

        if (prompt != null) {
            if (answers.isEmpty()) throw new IOException("La última pregunta no tiene respuestas.");
            questions.add(new Question(questionId, prompt, answers));
        }

        if (questions.isEmpty()) throw new IOException("No se encontraron preguntas en el archivo.");

        return questions;
    }
}
