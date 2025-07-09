
public class AlternativeStrings {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "qcramam"));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        if (word1.length() < 1 || word2.length() < 1 || word2.length() > 100) {
            return "words length is not valid";
        } else if (!word1.equals(word1.toLowerCase()) || !word2.equals(word2.toLowerCase())) {
            return "the word must be lowercase";
        } else {
            int maxLength = Math.max(word1.length(), word2.length());

            for (int i = 0; i < maxLength; i++) {
                if (i < word1.length()) {
                    result.append(word1.charAt(i));
                }
                if (i < word2.length()) {
                    result.append(word2.charAt(i));
                }
            }

            return result.toString();
        }

    }

}
