import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    // Method to sort the array
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Method to find minimum value
    public static int findMin(int[] arr) {
        System.out.println("Finding minimum value (array-operations branch)");
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
        System.out.println("Finding maximum value (array-operations branch)");
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to calculate sum
    public static int calculateSum(int[] arr) {
        System.out.println("Calculating sum (array-operations branch)");
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
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

        sortArray(numbers);

        int min = findMin(numbers);
        int max = findMax(numbers);
        int sum = calculateSum(numbers);
        double average = (double) sum / numbers.length;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
