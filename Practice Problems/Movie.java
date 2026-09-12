//ques 1
import java.util.Scanner;

class AccessChecker {

    static String classifyAccess(String fieldModifier, String accessorContext) {

        // Same class
        if (accessorContext.equals("SAME_CLASS")) {

            if (fieldModifier.equals("private") || fieldModifier.equals("default") || fieldModifier.equals("protected") || fieldModifier.equals("public")) {
                return "ALLOWED";
            }
        }

        // Same package
        if (accessorContext.equals("SAME_PACKAGE")) {

            if (fieldModifier.equals("default") || fieldModifier.equals("protected") || fieldModifier.equals("public")) {

                return "ALLOWED";
            }
        }

        // Different package
        if (accessorContext.equals("DIFFERENT_PACKAGE")) {

            if (fieldModifier.equals("public")) {
                return "ALLOWED";
            }
        }

        // Subclass in different package - own type
        if (accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")) {

            if (fieldModifier.equals("protected") || fieldModifier.equals("public")) {

                return "ALLOWED";
            }
        }

        // Subclass in different package - parent type
        if (accessorContext.equals("SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE")) {

            if (fieldModifier.equals("public")) {
                return "ALLOWED";
            }
        }

        return "DENIED";
    }
}

public class Movie{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of attempts:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter field modifier and accessor context:");

            String modifier = sc.next();
            String context = sc.next();

            String result = AccessChecker.classifyAccess(modifier, context);

            System.out.println(result);
        }

        sc.close();
    }
}