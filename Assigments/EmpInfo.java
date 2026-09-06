//ques 5
import java.util.Scanner;

class EmpInfo{

    String Name;
    double salary;

    static String company = "Bright Horizon Technologies";
    static int Count = 0;

    EmpInfo(String Name, double salary) {
        this.Name = Name;
        this.salary = salary;
        Count++;
    }

    static void printCompanyInfo() {
        System.out.println(company);
        System.out.println("Employees on record: " + Count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        EmpInfo[] employees = new EmpInfo[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new EmpInfo(name, salary);
        }

        System.out.println("\nCompany Information:");
        EmpInfo.printCompanyInfo();

        sc.close();
    }
}