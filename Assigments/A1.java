//ques 1
import java.util.Scanner;

public class A1 {

    static class Participant {
        String name;
        String teamName;
        boolean registered;

        Participant(String name, String teamName) {
            this.name = name;
            this.teamName = teamName;
            this.registered = true;
        }

        Participant(String name) {
            this(name, "Unassigned");
        }

        void printStatus() {
            System.out.println(name + " | " + teamName +
                    " | Registered: " + registered);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[4];
        String[] teamNames = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter team name (leave blank if solo): ");
            teamNames[i] = sc.nextLine();
        }

        for (int i = 0; i < 4; i++) {

            Participant p;

            if (teamNames[i].isEmpty()) {
                p = new Participant(names[i]);
            } else {
                p = new Participant(names[i], teamNames[i]);
            }

            p.printStatus();
        }

        sc.close();
    }
}