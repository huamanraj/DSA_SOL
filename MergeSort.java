import java.util.Scanner;

public class MergeSort {
    // This method merges two subarrays of the main array.
    static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copy data to temporary left and right arrays.
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of left and right arrays.
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // This method performs the merge sort algorithm on an array.
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        
        // Read and store the array elements.
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Call the mergeSort method to sort the array.
        mergeSort(arr, 0, n - 1);
        
        // Print the sorted array.
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
