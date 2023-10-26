import java.util.Scanner;

public class BinarySearch {
    // Binary search algorithm to find the target element in the array
    static int binarysearch(int target, int[] arr) {
        int l = 0; // Initialize the low index of the search range
        int h = arr.length - 1; // Initialize the high index of the search range
        while (l <= h) {
            int mid = (l + h) / 2; // Calculate the middle index
            if (arr[mid] == target) {
                return mid; // Return the index where the target element is found
            } else if (arr[mid] > target) {
                h = mid - 1; // Adjust the high index for the left subarray
            } else {
                l = mid + 1; // Adjust the low index for the right subarray
            }
        }
        return -1; // Return -1 to indicate that the target element was not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to search: ");
        int target = scanner.nextInt();
        int res = binarysearch(target, arr); // Call the binarysearch method
        if (res != -1) {
            System.out.println("Element " + target + " found at index " + res);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
