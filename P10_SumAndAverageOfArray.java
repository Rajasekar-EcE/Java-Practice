import java.util.Scanner;
public class P10_SumAndAverageOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        
        int[] array = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        double average =(double) sum / size;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        scan.close();
    }
}