//ques 2
import java.util.Scanner;

public class Canteen{

    static class Item {
        String itemName;
        int stock;

        Item(String itemName, int stock) {
            this.itemName = itemName;
            this.stock = stock;
        }

        void restock(int stock) {
            this.stock = this.stock + stock;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[4];

        for (int i = 0; i < 4; i++) {

            System.out.print("Enter item name: ");
            String itemName = sc.nextLine();

            System.out.print("Enter starting stock: ");
            int stock = sc.nextInt();
            sc.nextLine();

            items[i] = new Item(itemName, stock);
        }

        for (int i = 0; i < 4; i++) {

            items[i].restock(20);

            System.out.println(items[i].itemName + " | Final Stock: " + items[i].stock);
        }

        sc.close();
    }
}