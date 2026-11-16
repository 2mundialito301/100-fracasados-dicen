import java.util.List;

public class Question {
    private final int id;
    private final String prompt;
    private final List<Answer> answers;

    public Question(int id, String prompt, List<Answer> answers) {
        this.id = id;
        this.prompt = prompt;
        this.answers = answers;
    }

    public int getId() { return id; }
    public String getPrompt() { return prompt; }
    public List<Answer> getAnswers() { return answers; }
    public boolean isComplete() { return answers.stream().allMatch(Answer::isRevealed); }

    public Answer findUnrevealedMatch(String userAnswer) {
        for (Answer answer : answers) {
            if (!answer.isRevealed() && answer.matches(userAnswer)) return answer;
        }
        return null;
    }
}
