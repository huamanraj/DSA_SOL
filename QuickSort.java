import java.util.Scanner;

public class QuickSort {
    // Method to swap two elements in the array
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Recursive quicksort method
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort the subarrays on both sides of the pivot
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    // Partitioning method to find the pivot element
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap elements if they are smaller than the pivot
                swap(arr, i, j);
            }
        }

        // Swap the pivot element to its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the quicksort method to sort the array
        quicksort(arr, 0, n - 1);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

