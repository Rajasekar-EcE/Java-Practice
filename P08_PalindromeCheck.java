import java.util.Scanner;
public class P08_PalindromeCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        // === 1.PalindromeCheck Numbers ===
        // System.out.print("Enter the number: ");
        // int number=scan.nextInt();
        // int originalNumber=number,reversedNumber=0;
        // while(number!=0){
        //     int lastDigit=number%10;
        //     reversedNumber=reversedNumber*10+lastDigit;
        //     number=number/10;
        // }
        // if(originalNumber==reversedNumber){
        //     System.out.println("The Number is Palindrome.");
        // }else{
        //     System.out.println("The Number is Not Palindrome.");
        // }

        System.out.print("Enter the name: ");
        String name=scan.nextLine();
        String originalName=name;
        String reversedName="";
        for(int i=name.length()-1;i>=0;i--){
            reversedName=reversedName+name.charAt(i); 
        }
        if(originalName.equals(reversedName)){
            System.out.println("The Name is Palindrome.");
        }else{
            System.out.println("The Name is Not Palindrome.");
        }
        scan.close();
    }    
}