//ques 4
import java.util.Scanner;

public class Student {

    static String college;
    static String academicYear;

    String name;

    static {
        college = "SRM Institute of Science and Technology";
        academicYear = "2026-27";

        System.out.println("College info loaded");
    }

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student record created: " + name);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            students[i] = new Student(name);
        }

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
