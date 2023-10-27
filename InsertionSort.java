import java.util.Scanner;

public class InsertionSort {
    // This method performs insertion sort on an array.
    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // Place the key element in its correct position within the sorted part of the array.
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        
        // Read and store the array elements.
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Call the insertionSort method to sort the array.
        insertionSort(arr, n);
        
        // Print the sorted array.
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
