import java.util.Scanner;

class Student {
    String name;
    int age;
    char grade;

    void toDisplay(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("Student Details:" +
                           "\n   Name : " + name +
                           "\n   Age  : " + age +
                           "\n   Grade: " + grade);
    }
}

public class P16_DisplayDataUsingClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scan.nextLine();

        System.out.print("Enter the student's age: ");
        int age = scan.nextInt();

        System.out.print("Enter the student's grade: ");
        char grade = scan.next().charAt(0);

        Student object = new Student();
        object.toDisplay(name, age, grade);

        scan.close();
    }
}