import java.util.*;

class RadixSort {
    // Function to find the maximum element in the array
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // Function to perform counting sort for a specific digit (exp)
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Count the occurrences of each digit at the given position (exp)
        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Modify count array to store the cumulative count
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array by placing elements in their correct positions
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to the original array
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Function to perform radix sort on the array
    static void radixsort(int arr[], int n) {
        int m = getMax(arr, n);

        // Perform counting sort for each digit (exp) in the numbers
        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

    // Function to print the sorted array
    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the radixsort method to sort the array
        radixsort(arr, n);

        // Print the sorted array
        print(arr, n);
    }
}
