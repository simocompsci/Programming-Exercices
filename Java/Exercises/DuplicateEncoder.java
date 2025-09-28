public class DuplicateEncoder {

    public static void main(String[] args) {
        String word = "Prespecialized";
        System.out.println("The result is : " + encode(word));
    }

    public static String encode(String word) {
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (count(word , c) > 1) {
                res = res + ")";
            }
            else{
                res = res + "(";
            }
            
        }
        return res;
    }

    public static int count(String s , char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char charlower = Character.toLowerCase(s.charAt(i));
            if( charlower == c){
                count++;
            }
        }
        return count;
    }

}
