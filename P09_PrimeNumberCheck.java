import java.util.Scanner;

public class P09_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        boolean isPrime = true;

        if (number < 2) {
            System.out.println("The number is not a prime number.");
        } else {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("The number is a prime number.");
            } else {
                System.out.println("The number is not a prime number.");
            }
        }
        scan.close();
    }
}
