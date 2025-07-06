import java.util.Scanner;

public class P01_EvenOdd {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number=scan.nextInt();

        // === 1.Using if-else ===
        // if(number%2==0){
        //     System.out.println("The given number is EVEN");
        // }else{
        // System.out.println("The given number is ODD");
        // }

        // === 2.Using Ternary Operator ===
        // System.out.println((number%2==0)?"The given number is EVEN":"The given number is ODD");

        // === 3.Using Boolean and if-else ===
        // boolean even=false;
        // if(number%2==0)  
        //     even=true;  //using single line body, no need of {} brackets
        // else
        //     even=false;
        // if(even)
        //     System.out.println("The given number is EVEN");
        // else
        //     System.out.println("The given number is ODD");
        scan.close();
    }
}
