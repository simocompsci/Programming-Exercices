import java.util.ArrayList;

public class Kata {
    public static void main(String[] args) {
        // System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        // System.out.println(squareDigits(66666));
        // System.out.println(reverseWords("This is an example!"));
        int[] integers = { 2, 4, 0, 100, 4, 11, 2602, 36 };
        System.out.println(find(integers));

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

    public static String reverseWords(final String original) {

        StringBuilder sentence = new StringBuilder();
        String[] toArr = original.split(" ");
        for (int i = 0; i < toArr.length; i++) {
            if (!toArr[i].isEmpty()) {
                sentence.append(new StringBuilder(toArr[i]).reverse());
            }

            if (i < toArr.length - 1) {
                sentence.append(" ");
            }
        }

        return sentence.toString();
    }

    static int find(int[] integers) {
        int result;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                even.add(integers[i]);
            } else {
                odd.add(integers[i]);
            }
        }
        if (odd.size() == 1) {
            result = odd.get(0);
        } else {
            result = even.get(0);
        }
        return result;
    }

}