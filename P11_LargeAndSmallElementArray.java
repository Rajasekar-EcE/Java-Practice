import java.util.Scanner;

public class P11_LargeAndSmallElementArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scan.nextInt();

        int[] elements = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            elements[i] = scan.nextInt();
        }

        int max = elements[0];
        int min = elements[0];

        for (int i = 1; i < size; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
            if (elements[i] < min) {
                min = elements[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
        System.out.println("The smallest element in the array is: " + min);
        scan.close();
    }
}