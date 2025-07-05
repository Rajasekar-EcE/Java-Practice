import java.util.Scanner;

public class P04_GreatestOfThreeNumbers{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter the value 1: ");
        double value1=scan.nextDouble();
        System.out.print("Enter the value 2: ");
        double value2=scan.nextDouble();
        System.out.print("Enter the value 3: ");
        double value3=scan.nextDouble();

        if((value1>value2)&&(value1>value3)){
            System.out.println("The value 1 is greater.");
        }else if(value2>value3){
            System.out.println("The value 2 is greater.");
        }else{
            System.out.println("The value 3 is greater.");
        }
        scan.close();
    }
}
