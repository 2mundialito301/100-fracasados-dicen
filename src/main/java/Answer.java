import java.util.ArrayList;
import java.util.List;

public class Answer {
    private final String text;
    private final int points;
    private final List<String> acceptedForms;
    private boolean revealed;

    public Answer(String text, int points, List<String> acceptedForms) {
        this.text = text;
        this.points = points;
        this.acceptedForms = new ArrayList<>(acceptedForms);
        this.acceptedForms.add(text);
    }

    public String getText() { return text; }
    public int getPoints() { return points; }
    public boolean isRevealed() { return revealed; }
    public void reveal() { revealed = true; }
    public boolean matches(String userAnswer) {
        for (String acceptedForm : acceptedForms) {
            if (AnswerMatcher.isCorrect(userAnswer, acceptedForm)) return true;
        }
        return false;
    }
}
