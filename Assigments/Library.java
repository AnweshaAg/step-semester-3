//ques 4
import java.util.Scanner;

public class Library{

    static class MembershipCard {

        static String libraryName;
        static String validUntil;

        String studentName;

        static {
            libraryName = "SRM Central Library";
            validUntil = "May 2027";

            System.out.println("Library info loaded");
        }

        MembershipCard(String studentName) {
            this.studentName = studentName;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {

            MembershipCard card = new MembershipCard(names[i]);

            System.out.println("Membership card issued: " + card.studentName);
        }

        sc.close();
    }
}