import java.util.Scanner;

public class SelectionSort {

    // This method performs selection sort on an array.
    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Find the index of the minimum element in the remaining unsorted part of the array.
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the minimum element with the current element.
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
            // Print the array at each pass to visualize the sorting process.
            System.out.print("Pass " + (i + 1) + " : ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array :  ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        
        // Read and store the array elements.
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Call the selectionSort method to sort the array.
        selectionSort(arr, n);
        
        // Print the sorted array.
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
