public class LinearS {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 6, 3, 8, 7, 11, 55, 88, 99, 101 };
        int target = 101;
        int result = LinearSearch(arr, target);
        System.out.println("the index of our element is : " + result);

    }

    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
