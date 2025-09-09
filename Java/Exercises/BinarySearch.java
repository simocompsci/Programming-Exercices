public class BinarySearch {
    
    // Iterative implementation
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    // Recursive implementation
    public static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }
    
    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }
    
    // Test the implementations
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 67, 89};
        int target = 5;
        
        System.out.println("Array: " + java.util.Arrays.toString(sortedArray));
        System.out.println("Target: " + target);
        
        // Test iterative search
        int resultIterative = binarySearchIterative(sortedArray, target);
        System.out.println("Iterative search result: Index " + resultIterative);
        
        // Test recursive search
        int resultRecursive = binarySearchRecursive(sortedArray, target);
        System.out.println("Recursive search result: Index " + resultRecursive);
        
        // Test for non-existent element
        int nonExistent = 99;
        int resultNotFound = binarySearchIterative(sortedArray, nonExistent);
        System.out.println("Search for " + nonExistent + ": " + 
                          (resultNotFound == -1 ? "Not found" : "Found"));
    }
}