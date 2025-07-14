import java.util.Scanner;

public class P15_CheckPrimeUsingMethods {

    boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        P15_CheckPrimeUsingMethods object = new P15_CheckPrimeUsingMethods();

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        boolean isPrime = object.checkPrime(number);

        if (isPrime) {
            System.out.println("The given number is a prime number.");
        } else {
            System.out.println("The given number is not a prime number.");
        }

        scan.close();
    }
}