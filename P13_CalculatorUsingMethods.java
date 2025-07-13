import java.util.Scanner;

public class P13_CalculatorUsingMethods {
    
    void add(double num1, double num2) {
        System.out.println("The addition of two numbers is: " + (num1 + num2));
    }

    void sub(double num1, double num2) {
        System.out.println("The subtraction of two numbers is: " + (num1 - num2));
    }

    void mul(double num1, double num2) {
        System.out.println("The multiplication of two numbers is: " + (num1 * num2));
    }

    void div(double num1, double num2) {
        System.out.println((num2 == 0) ? "Can't divide by zero." : "The division of two numbers is: " + (num1 / num2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        
        System.out.println("Select your operation:\n   1. Addition\n   2. Subtraction\n   3. Multiplication\n   4. Division");
        System.out.print("Selected operation: ");
        int operation = scan.nextInt();

        P13_CalculatorUsingMethods obj = new P13_CalculatorUsingMethods();

        switch (operation) {
            case 1:
                obj.add(num1, num2);
                break;
            case 2:
                obj.sub(num1, num2);
                break;
            case 3:
                obj.mul(num1, num2);
                break;
            case 4:
                obj.div(num1, num2);
                break;
            default:
                System.out.println("Please choose a correct operation (1-4).");
        }
        scan.close();
    }
}