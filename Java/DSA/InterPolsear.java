public class InterPolsear {
    public static void main(String[] args) {
        int arr[] = {1,5,51,9,6,3,1,4,7,8,55};
        int target = 9;
        int index = interpolationSearch(arr , target);
        System.out.println("the target is found at the index " + index);
    }
    private static int interpolationSearch(int arr[] , int target){
        int high = arr.length - 1;
        int low = 0;
        while(target >= arr[low] && target <= arr[high] && low <= high){
            int probe = low + (high - low) * (target - arr[low]) / (arr[high] - arr[low]); // this is a formula to calculate the probe value
            System.out.println("probe : " + probe);
            
            if(arr[probe] == target){
                return probe;
            }
            else if (arr[probe] < target) {
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }
        }
        return -1;
    }
}
