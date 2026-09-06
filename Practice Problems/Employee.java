//question 2
import java.util.Scanner;

public class Employee {

    String id;
    String name;
    double salary;

    Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    void display() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.print("Enter bonus amount: ");
        double bonus = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            employees[i].raiseSalary(bonus);
            employees[i].display();
        }

        sc.close();
    }
}