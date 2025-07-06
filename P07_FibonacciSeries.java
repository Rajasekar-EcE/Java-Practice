import java.util.Scanner;
public class P07_FibonacciSeries{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int term=scan.nextInt();
        int first=0;
        int second=1;
        int next= 0;
        System.out.print("Fibonacci Series up to " + term + " terms: ");
        for(int i=0;i<term;i++){
            System.out.print(first+" ");
            next=first+second;
            first=second;
            second=next;
        }
        scan.close();
    }
}
