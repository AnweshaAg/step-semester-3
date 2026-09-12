//ques 4
import java.util.Scanner;

class BookingProfile {

    private String name;
    private boolean confirmed;
    private String otp;

    public BookingProfile() {

        confirmed = false;
    }

    public BookingProfile(String name) {

        this();
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isConfirmed() {

        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {

        this.confirmed = confirmed;
    }

    public void setOtp(String otp) {

        this.otp = otp;
    }
}

public class OTPManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        BookingProfile p =
            new BookingProfile(name);

        System.out.println(
            "Enter confirmation status (true/false):"
        );

        boolean confirmed = sc.nextBoolean();

        p.setConfirmed(confirmed);

        System.out.println(
            "Enter OTP:"
        );

        String otp = sc.next();

        p.setOtp(otp);

        System.out.println("Name: " + p.getName());

        System.out.println(
            "Confirmed: " + p.isConfirmed()
        );

        System.out.println(
            "OTP has been set successfully."
        );

        sc.close();
    }
}