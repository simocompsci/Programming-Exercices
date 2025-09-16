

public class BynSear {
    public static void main(String[] args) {
        // a search algorithm that finds the position of a target value within a sorted array.
        // half of the array is eliminated during each "step"
        int[] arr = new int[1000000];
        int target = 777777;
        System.out.println("The programm is runnnig please wait");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // this Arrays class method is already built in
        // int index = Arrays.binarySearch(arr, target);
        // if(index == -1){
        //     System.out.println("target not found");
        // }
        // else{
        //     System.out.println("element found at : " + index);
        // }

        int index = binarySearch(arr, target);
        System.out.println("The element is foud at index : " + index);
    }

    public static int binarySearch(int[] arr , int target){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) { 
            int mid = low + (high - low)/2;
            int value = arr[mid];

            if(value < target) low = mid +1;
            else if(value > target) high = mid - 1;
            else return mid;
        }

        return -1;
    }
}
