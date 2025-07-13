import java.util.Scanner;
public class P14_LeapYearUsingMethods {
    static boolean leapYear(int year) {
        if ((year%4==0) && (year%100!=0 || year%400==0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        boolean isLeap = leapYear(year);
        
        System.out.println(isLeap ? "The given year is a leap year." : "The given year is not a leap year.");
        scan.close();
    }
}