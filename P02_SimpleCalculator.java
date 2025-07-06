import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        // === 1.Using Switch Concept ===
        // System.out.println("=== Select our operation ===");
        // System.out.println("  1.Addition(+)\n  2.Subtraction(-) \n  3.Multiplication(*) \n  4.Division(/)");
        // System.out.print("\nYour selected operation is: ");
        // char operation=scan.next().charAt(0);
        // System.out.print("\nEnter your 1st Number: ");
        // double num1=scan.nextDouble();
        // System.out.print("Enter your 2nd Number: ");
        // double num2=scan.nextDouble();
        // switch(operation){
        //     case '+':
        //         System.out.println("\nResult is: "+(num1+num2));
        //         break;
        //     case '-':
        //         System.out.println("\nResult is: "+(num1-num2));
        //         break;
        //     case '*':
        //         System.out.println("\nResult is: "+(num1*num2));
        //         break;
        //     case '/':
        //         System.out.println((num2==0)?"\nCannot divided by 0":"\nResult is:"+(num1/num2));
        //         break;
        //     default:
        //         System.out.println("\nPlease Select Correct Operation(+,-,*,/).");
        //         break;
        // }

        
        // === 2.Using String Concept ===
        // System.out.println("=== Select our operation ===");
        // System.out.println("  1.Addition(add)\n  2.Subtraction(sub) \n  3.Multiplication(mul) \n  4.Division(div)");
        // System.out.print("\nYoure selected operation is: ");
        // String operation=scan.nextLine();
        // System.out.print("\nEnter your 1st Number: ");
        // double num1=scan.nextDouble();
        // System.out.print("Enter your 2nd Number: ");
        // double num2=scan.nextDouble();
        // if(operation.equalsIgnoreCase("add")){
        //     System.out.println("\nResult is: "+(num1+num2));
        // }else if(operation.equalsIgnoreCase("sub")){
        //     System.out.println("\nResult is: "+(num1-num2));
        // }else if(operation.equalsIgnoreCase("mul")){
        //     System.out.println("\nResult is: "+(num1*num2));
        // }else if(operation.equalsIgnoreCase("div")){
        //     System.out.println((num2==0)?"\nCan't divided by 0":"\nResult is:"+(num1/num2));
        // }else{
        //     System.out.println("Please select correct operation (add,sub,mul,div).");
        // }
        scan.close();
    }
}
