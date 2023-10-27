//Method to implement Bubble Sort

import java.util.Scanner;

public class BubbleSort {
    // Method to perform the bubble sort algorithm on an array
    static void bubbleSort(int[] arr, int n) {
        int temp;
        // Loop through each pass of the bubble sort
        for (int i = 0; i < n - 1; i++) {
            System.out.print("Pass " + (i + 1) + " : ");
            // Inner loop for comparing and swapping elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap elements if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Display the current state of the array after this pass
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println(); // Move to the next line for the next pass
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Call the bubbleSort method to sort the array
        bubbleSort(arr, n);
        System.out.print("Sorted Array: ");
        // Display the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
