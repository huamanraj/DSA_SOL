import java.util.Scanner;

public class LinearSearch {

    // This method performs a linear search for an item in the array.
    static int linearSearch(int item, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i; // If the item is found, return its index.
            }
        }
        return -1; // If the item is not found, return -1.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        
        // Read and store the elements in the array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the value you want to search : ");
        int item = scanner.nextInt();

        int i = linearSearch(item, arr);

        // Check if the item was found and display the result.
        if (i != -1) {
            System.out.println("Item found at position " + i);
        } else {
            System.out.println("Item not found in the array.");
        }
    }
}
