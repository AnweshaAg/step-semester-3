//ques 5
import java.util.Scanner;

public class PaymentProcessor {

    static double totalCollected = 0;

    static class Payment {

        void pay(double amount) {
            System.out.println("Paid (cash): Rs " + amount);
        }
    }

    static class CardPayment extends Payment {

        void payWithProcessingFee(double amount) {

            double total = amount + (amount * 0.02);

            System.out.println("Charged (card, incl. fee): Rs " + total);

            totalCollected = totalCollected + total;
        }
    }

    static void processTransaction(Payment payment, double amount) {

        if (payment instanceof CardPayment) {

            CardPayment card = (CardPayment) payment;

            card.payWithProcessingFee(amount);

        } else {

            payment.pay(amount);

            totalCollected = totalCollected + amount;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Payment[] payments = new Payment[5];
        double[] amounts = new double[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter payment type (card/cash): ");
            String type = sc.nextLine();

            System.out.print("Enter amount: ");
            amounts[i] = sc.nextDouble();
            sc.nextLine();

            if (type.equalsIgnoreCase("card")) {
                payments[i] = new CardPayment();
            } else {
                payments[i] = new Payment();
            }
        }

        for (int i = 0; i < 5; i++) {

            processTransaction(payments[i], amounts[i]);
        }

        System.out.println("Total Collected: Rs " + totalCollected);

        sc.close();
    }
}