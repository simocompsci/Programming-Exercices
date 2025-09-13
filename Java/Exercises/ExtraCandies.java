import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ExtraCandies {

    public static void main(String[] args) {
       int candies[] = {12,1,12};
       int extraCandies = 10; 
       List<Boolean> res = kidsWithCandies(candies , extraCandies);
       System.out.println(res);
    }


    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        ArrayList<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max) {
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
