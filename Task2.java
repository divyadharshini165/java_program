import java.util.Scanner;
import java.util.Arrays;
public class Task2 {
    public static void sortArray(int[] arr){
        Arrays.sort(arr);
        System.out.println("Sorted array:"+Arrays.toString(arr));
    }
    public static int findmin(int[] arr){
        int min = arr[0];
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
            return min;
     }
    public static int findmax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
            return max;
    }
    public static int calculatesum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
    public static double average(int[] arr){
        return(double) calculatesum(arr) / arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i = 0;i<5;i++){
            numbers[i] = sc.nextInt();

        }
        System.out.println("\n---ARRAY OPERATIONS---");
        sortArray(numbers);
        System.out.println("Minimum:" +findmin(numbers));
        System.out.println("Maximum:" +findmax(numbers));
        System.out.println("Sum:" +calculatesum(numbers));
        System.out.println("Average:" +average(numbers));
        sc.close();
        
    }
 }
    
