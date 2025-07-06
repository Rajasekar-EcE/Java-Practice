import java.util.Scanner;
public class P06_FactorialNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=scan.nextInt();
        System.out.println("\nThe Factorial of Given number is: ");
        int fact=1;
        for(int i=number;i>0;i--){
            fact=fact*i;
        }
        System.out.println(number+"!= "+fact);
        scan.close();
    }
}
