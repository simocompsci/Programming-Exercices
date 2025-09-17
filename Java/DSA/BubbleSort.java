public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // n-1 passes
            for (int j = 0; j < n - 1 - i; j++) { // bubble the largest to the end
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 1, 4, 2, 8 };
        bubbleSort(a);
        for (int x : a)
            System.out.print(x + " ");
    }
}
