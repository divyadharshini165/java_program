import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    // Method to sort the array
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 🔥 Small change added for sorting-logic branch
        System.out.println("This is the sorting-logic branch update.");
    }

    // Method to find minimum value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find maximum value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(numbers));

        // Calling methods
        sortArray(numbers);

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
