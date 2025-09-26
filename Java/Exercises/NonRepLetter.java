
public class NonRepLetter {
    public static void main(String[] args) {
        // the function should return the first non repeating carachter
        // upper and lowercase are the same but the function should return the correct
        // case of the character
        // if string contains all repeating chars return ""

        // HashSet<Character> set = new HashSet<>();
        // for (int i = 0; i < word.length(); i++) {
        // set.add(word.charAt(i));
        // }

        // System.out.println(set);

        String word = "stress";
        System.out.println("the result is : " + nonrepeating(word));

    }

    public static int count(String s, char c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static String nonrepeating(String word) {
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            if(count(word, word.charAt(i)) == 1){
                res = Character.toString(word.charAt(i)); 
            }
            else{
                res = "e";
            }

        }
        return res;
    }
}
