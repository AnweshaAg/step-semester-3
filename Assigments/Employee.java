//ques 3
import java.util.Scanner;

class Employee{

    String Id;
    String Name;
    double salary;
    boolean Intern;

    public Employee(String Id, String Name, double salary) {
        this.Id = Id;
        this.Name = Name;
        this.salary = salary;
        this.Intern = false;
    }

    public Employee(String Id, String Name) {
        this(Id, Name, 0);
        this.Intern = true;
    }

    void printProfile() {
        System.out.println(Id + " | " + Name + " | Rs " + salary + " | Intern: " + Intern);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Permanent Employee");

        System.out.print("Enter employee ID: ");
        String id1 = sc.nextLine();

        System.out.print("Enter employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Employee permanent = new Employee(id1, name1, salary);

        System.out.println("\nIntern Employee");

        System.out.print("Enter employee ID: ");
        String id2 = sc.nextLine();

        System.out.print("Enter employee name: ");
        String name2 = sc.nextLine();

        Employee intern = new Employee(id2, name2);

        System.out.println("\nEmployee Profiles:");
        permanent.printProfile();
        intern.printProfile();

        sc.close();
    }
}