
public class Kata {

    public static void main(String[] args) {
        // System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(squareDigits(66666));
    }

    public static String whoLikesIt(String... names) {

        int arrLen = names.length;
        switch (arrLen) {
            case 0 -> {
                return "no one like this";
            }
            case 1 -> {
                return names[0] + " like this";
            }
            case 2 -> {
                return names[0] + " and " + names[1] + " like this";
            }
            case 3 -> {
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            }
            default -> {
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
            }
        }
    }

    public static int squareDigits(int n) {
        String strx = Integer.toString(n);       
        StringBuilder sb = new StringBuilder();  

        for (int i = 0; i < strx.length(); i++) {
            int digit = strx.charAt(i) - '0';  
            int squared = digit * digit;         
            sb.append(squared);                  
        }

        return Integer.parseInt(sb.toString());

    }
