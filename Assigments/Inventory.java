//ques 3
import java.util.Scanner;

public class Inventory {

    private int Total;
    private int Available;

    Inventory(int Total) {
        this.Total = Total;
        this.Available = Total;
    }

    void checkOut() {
        if (Available > 0) {
            Available--;
        }
    }

    void checkIn() {
        if (Available < Total) {
            Available++;
        }
    }

    int CopiesAvailable() {
        return Available;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Total = sc.nextInt();
        int operations = sc.nextInt();

        Inventory b = new Inventory(Total);

        for (int i = 0; i < operations; i++) {

            String operation = sc.next();

            if (operation.equals("checkout")) {
                b.checkOut();
            }
            else if (operation.equals("checkin")) {
                b.checkIn();
            }
        }

        System.out.println(b.CopiesAvailable());

        sc.close();
    }
}