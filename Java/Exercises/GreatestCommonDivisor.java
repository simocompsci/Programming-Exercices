
public class GreatestCommonDivisor {

    public static void main(String args[]) {
        System.out.println(gcdOfStrings("ABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String GCD = "";
        StringBuilder comparingString = new StringBuilder();

        if (str1.length() < 1 || str2.length() > 1000) {
            return "The lentgh of the string is not valid";
        } else if (!str1.equals(str1.toUpperCase()) || !str2.equals(str2.toUpperCase())) {
            return "The two strings must be Uppercase";
        } else {
            // str1 = str2 + str2 + str2.... + str2

            // take every character that is the same in the two strings and store it in a variable and 
            // pass to the next one 

            // once we hit a charachter that is equal to the first one we restrat the process

            // after that we compare our results if they are the same then we pass to the next one

            // if the next one doesnt start with the same character we break

            // first of all we test if the indexes are equal and are equal 
            // to index = 0 if that s the case we then put a for loop  that 
            // starts at  the last index we stoped in and continues until
            // the length of the string that we put the carachters in
            int MaxLength = Math.max(str1.length(), str2.length());
            for (int i = 0; i < MaxLength; i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    comparingString.append(str1.charAt(i));
                } else {
                    return "error";
                }
            }
        }

        return comparingString.toString();
    }
}
