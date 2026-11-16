import java.text.Normalizer;
import java.util.Locale;

public class AnswerMatcher {
    private static final double SIMILARITY_THRESHOLD = 0.80;
    private static final int MINIMUM_FUZZY_LENGTH = 5;

    public static boolean isCorrect(String userAnswer, String acceptedAnswer) {
        String first = normalizeText(userAnswer);
        String second = normalizeText(acceptedAnswer);
        if (first.isEmpty() || second.isEmpty()) return false;
        if (first.equals(second)) return true;
        if (Math.min(first.length(), second.length()) < MINIMUM_FUZZY_LENGTH) return false;
        return calculateSimilarity(first, second) >= SIMILARITY_THRESHOLD;
    }

    public static String normalizeText(String text) {
        if (text == null) return "";
        return Normalizer.normalize(text.trim().toLowerCase(Locale.ROOT), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "").replaceAll("\\s+", " ");
    }

    public static double calculateSimilarity(String firstText, String secondText) {
        int longestLength = Math.max(firstText.length(), secondText.length());
        if (longestLength == 0) return 1.0;
        return 1.0 - (double) calculateLevenshteinDistance(firstText, secondText) / longestLength;
    }

    public static int calculateLevenshteinDistance(String firstText, String secondText) {
        int[] previous = new int[secondText.length() + 1];
        int[] current = new int[secondText.length() + 1];
        for (int column = 0; column <= secondText.length(); column++) previous[column] = column;
        for (int row = 1; row <= firstText.length(); row++) {
            current[0] = row;
            for (int column = 1; column <= secondText.length(); column++) {
                int cost = firstText.charAt(row - 1) == secondText.charAt(column - 1) ? 0 : 1;
                current[column] = Math.min(Math.min(current[column - 1] + 1, previous[column] + 1), previous[column - 1] + cost);
            }
            int[] temporary = previous;
            previous = current;
            current = temporary;
        }
        return previous[secondText.length()];
    }
}
