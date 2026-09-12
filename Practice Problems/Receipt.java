import java.util.Scanner;

class BookingReceipt{

    private final String Id;
    private final String[] seatNo;

    public BookingReceipt(String Id,String[] seatNo) {

        this.Id = Id;

        this.seatNo = seatNo.clone();
    }

    public String[] SeatNumbers() {

        return seatNo.clone();
    }

    public BookingReceipt UpdatedSeat(int index, String newSeat) {

        String[] newSeats = seatNo.clone();

        if (index >= 0 && index < newSeats.length) {

            newSeats[index] = newSeat;
        }

        return new BookingReceipt(Id,newSeats);
    }
}

class GroupBooking extends BookingReceipt {

    private final int groupSize;

    public GroupBooking(String Id,String[] seatNumbers,int groupSize) {

        super(Id, seatNumbers);

        this.groupSize = groupSize;
    }
}

public class Receipt{

    static String NightlySettlement(BookingReceipt[] receipts) {

        int processed = 0;
        int nullSkipped = 0;
        int group = 0;
        int individual = 0;

        for (int i = 0; i < receipts.length; i++) {

            if (receipts[i] == null) {

                nullSkipped++;
                continue;
            }

            processed++;

            if (receipts[i] instanceof GroupBooking) {

                group++;

            } else {

                individual++;
            }
        }

        return processed + " processed | " + nullSkipped + " null skipped | " + group + " group | " + individual + " individual";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter booking ID:");
        String bookingId = sc.nextLine();

        System.out.println("Enter number of seats:");
        int n = sc.nextInt();

        String[] seats = new String[n];

        System.out.println("Enter seat numbers:");

        for (int i = 0; i < n; i++) {

            seats[i] = sc.next();
        }

        BookingReceipt receipt = new BookingReceipt(bookingId,seats);

        System.out.println("Original seats:");

        String[] original = receipt.SeatNumbers();

        for (int i = 0; i < original.length; i++) {

            System.out.print(original[i] + " ");
        }

        System.out.println();

        System.out.println("Enter index to update:");

        int index = sc.nextInt();

        System.out.println("Enter new seat:");

        String newSeat = sc.next();

        BookingReceipt updated =receipt.UpdatedSeat(index,newSeat);

        System.out.println("Original receipt seats:");

        String[] oldSeats =receipt.SeatNumbers();

        for (int i = 0; i < oldSeats.length; i++) {

            System.out.print(oldSeats[i] + " ");
        }

        System.out.println();

        System.out.println("Updated receipt seats:");

        String[] updatedSeats = updated.SeatNumbers();

        for (int i = 0; i < updatedSeats.length; i++) {

            System.out.print(updatedSeats[i] + " ");
        }

        System.out.println();

        GroupBooking groupReceipt = new GroupBooking("CH-2002",new String[]{"B1", "B2"},2);

        BookingReceipt individualReceipt = new BookingReceipt("CH-3003", new String[]{"C1"});

        BookingReceipt[] receipts = {groupReceipt,null,individualReceipt};

        System.out.println(Receipt.NightlySettlement(receipts));

        sc.close();
    }
}