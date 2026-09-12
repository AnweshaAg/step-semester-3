//ques 3
import java.util.Scanner;

class CineScreen {

    private int Total;
    private int Available;

    CineScreen(int Total) {

        if (Total <= 0) {
            throw new IllegalArgumentException("Invalid seat count");
        }

        this.Total = Total;
        this.Available = Total;
    }

    void bookSeat() {

        if (Available > 0) {
            Available--;
        }
    }

    void cancelBooking() {

        if (Available < Total) {
            Available++;
        }
    }

    int SeatsAvailable() {

        return Available;
    }
}

public class Seating{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of seats:");
        int total = sc.nextInt();

        try {

            CineScreen c = new CineScreen(total);

            System.out.println("Enter number of bookings:");

            int bookings = sc.nextInt();

            for (int i = 0; i < bookings; i++) {
                c.bookSeat();
            }

            System.out.println("Available seats after booking: "+ c.SeatsAvailable());

            System.out.println("Enter number of cancellations:");

            int cancellations = sc.nextInt();

            for (int i = 0; i < cancellations; i++) {
                c.cancelBooking();
            }

            System.out.println(
                "Available seats after cancellation: "
                + c.SeatsAvailable()
            );

        } catch (IllegalArgumentException e) {

            System.out.println("Construction rejected");
        }

        sc.close();
    }
}