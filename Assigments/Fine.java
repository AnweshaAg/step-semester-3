//ques 3
import java.util.Scanner;

public class Fine{

    static class ParkingTicket {

        String vehicleNo;
        double ratePerMinute;

        ParkingTicket(String vehicleNo, double ratePerMinute) {
            this.vehicleNo = vehicleNo;
            this.ratePerMinute = ratePerMinute;
        }

        final double calculateFine(int overstayMinutes) {
            return overstayMinutes * ratePerMinute;
        }

        final void printReceipt(int overstayMinutes) {
            double fine = calculateFine(overstayMinutes);

            System.out.println(vehicleNo + " - Fine: Rs " + fine);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] vehicleNos = new String[4];
        double[] rates = new double[4];
        int[] overstayMinutes = new int[4];

        for (int i = 0; i < 4; i++) {

            System.out.print("Enter vehicle number: ");
            vehicleNos[i] = sc.nextLine();

            System.out.print("Enter rate per minute: ");
            rates[i] = sc.nextDouble();

            System.out.print("Enter overstay minutes: ");
            overstayMinutes[i] = sc.nextInt();

            sc.nextLine();
        }

        for (int i = 0; i < 4; i++) {

            ParkingTicket ticket =
                    new ParkingTicket(vehicleNos[i], rates[i]);

            if (overstayMinutes[i] > 0) {
                ticket.printReceipt(overstayMinutes[i]);
            } else {
                System.out.println(vehicleNos[i] + " - No fine, within allotted time");
            }
        }

        sc.close();
    }
}