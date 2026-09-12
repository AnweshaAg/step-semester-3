//ques 1
import java.util.Scanner;

class AccessChecker {

    static String classifyAccess(String fieldModifier, String accessorContext) {

        if (accessorContext.equals("SAME_CLASS")) {
            return "ALLOWED";
        }

        if (accessorContext.equals("SAME_PACKAGE")) {
            if (fieldModifier.equals("default") || fieldModifier.equals("protected") || fieldModifier.equals("public")) {
                return "ALLOWED";
            }
        }

        if (accessorContext.equals("DIFFERENT_PACKAGE")) {
            if (fieldModifier.equals("public")) {
                return "ALLOWED";
            }
        }

        return "DENIED";
    }

    static String summarizeBatch(String[][] attempts) {

        int allowed = 0;
        int denied = 0;

        for (int i = 0; i < attempts.length; i++) {

            String result = classifyAccess(
                attempts[i][0],
                attempts[i][1]
            );

            if (result.equals("ALLOWED")) {
                allowed++;
            } else {
                denied++;
            }
        }

        return "Allowed: " + allowed + " | Denied: " + denied;
    }
}

class MovieTicket {

    private String seatNumber;
    String screenId;              
    protected double ticketPrice;
    public String movieTitle;
}

public class Movies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of attempts:");
        int n = sc.nextInt();

        String[][] attempts = new String[n][2];

        System.out.println("Enter modifier and context:");

        for (int i = 0; i < n; i++) {

            attempts[i][0] = sc.next();
            attempts[i][1] = sc.next();
        }

        System.out.println(
            AccessChecker.summarizeBatch(attempts)
        );

        sc.close();
    }
}