//ques 3
import java.util.Scanner;

public class LateFee {

    double total;

    LateFee(double total) {
        this.total = total;
    }

    final double calculateLateFee(int daysLate) {
        return daysLate * 2000;
    }

    final void printSummary(String regNo, int daysLate) {

        if (daysLate <= 0) {
            System.out.println(regNo + " - On time, no late fee");
        } else {
            double lateFee = calculateLateFee(daysLate);

            System.out.println(
                regNo + " | Total Fee: Rs " + total +
                " | Late Fee: Rs " + lateFee
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Registration Number: ");
            String regNo = sc.next();

            System.out.print("Enter Total Fee: ");
            double total = sc.nextDouble();

            System.out.print("Enter Days Late: ");
            int daysLate = sc.nextInt();

            LateFee account = new LateFee(total);

            account.printSummary(regNo, daysLate);
        }

        sc.close();
    }
}