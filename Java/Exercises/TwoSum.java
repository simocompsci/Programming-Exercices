import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr , 9);
        System.out.println("the result is : " + Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int x , y;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (Integer key : map.keySet()) {
            x = key;
            y = target - x;
            if(x!= y && map.containsKey(y)){
                result[0] = map.get(x);
                result[1] = map.get(y);
            }
            else{
                
            }
        }
        return  result;
    }
}