// ques 5
import java.util.Scanner;

public class FeeAccount {

    String accountNo;
    boolean hostel;

    FeeAccount(String accountNo, boolean hostel) {
        this.accountNo = accountNo;
        this.hostel = hostel;
    }

    void processPayment(FeeAccount account, double amount) {

        if (account instanceof FeeAccount) {

            if (account.hostel) {
                System.out.println(
                    "Paid in two installments (hostel account)"
                );
            } else {
                System.out.println(
                    "Paid in one go (day-scholar account)"
                );
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        FeeAccount[] accounts = new FeeAccount[n];

        int hostelCount = 0;
        int dayScholarCount = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Account Number: ");
            String accountNo = sc.next();

            System.out.print("Enter account type (1-Hostel, 2-Day Scholar): ");
            int type = sc.nextInt();

            boolean hostel;

            if (type == 1) {
                hostel = true;
            } else {
                hostel = false;
            }

            accounts[i] = new FeeAccount(accountNo, hostel);
        }

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        FeeAccount obj = new FeeAccount("TEMP", false);

        for (int i = 0; i < n; i++) {

            obj.processPayment(accounts[i], amount);

            if (accounts[i].hostel) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }

        System.out.println(
            "Hostel accounts processed: " + hostelCount
        );

        System.out.println(
            "Day-scholar accounts processed: " + dayScholarCount
        );

        sc.close();
    }
}