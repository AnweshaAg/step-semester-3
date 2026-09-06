//question 1
import java.util.Scanner;

public class LibraryBook {

    String title;
    String isbn;

    LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    LibraryBook(String title) {
        this(title, "PENDING");
    }

    void printDetails() {
        System.out.println(title + " | " + isbn + " | Catalogued: true");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        LibraryBook[] books = new LibraryBook[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter ISBN (press Enter if unavailable): ");
            String isbn = sc.nextLine();

            if (isbn.isEmpty()) {
                books[i] = new LibraryBook(title);
            } else {
                books[i] = new LibraryBook(title, isbn);
            }
        }

        System.out.println("\nBook Details:");

        for (int i = 0; i < n; i++) {
            books[i].printDetails();
        }

        sc.close();
    }
}