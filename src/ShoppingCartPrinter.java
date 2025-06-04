import java.sql.SQLOutput;
//Christine Carde
//06.03.25
//IT-145 Module 5 Lab.12
 //Inherited ItemToPurchase
import java.util.Scanner;



public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get item 1 details from user, create itemToPurchase object
        System.out.println("Item 1");
        System.out.print("Enter the item name: ");
        productName = scanner.nextLine();

        System.out.print("Enter the item price: ");
        productPrice = scanner.nextInt();

        System.out.print("Enter the item quantity: ");
        productQuantity = scanner.nextInt();

        item1.setName(productName);
        item1.setPrice(productPrice);
        item1.setQuantity(productQuantity);

        scanner.nextLine();
        // Get item 2 details from user, create itemToPurchase object
        System.out.println("\nItem 2");
        System.out.print("Enter the item name: ");
        productName = scanner.nextLine();

        System.out.print("Enter the item price: ");
        productPrice = scanner.nextInt();

        System.out.print("Enter the item quantity: ");
        productQuantity = scanner.nextInt();

        item2.setName(productName);
        item2.setPrice(productPrice);
        item2.setQuantity(productQuantity);

        // Add costs of two items and print total
        // cartTotal = item one price + item two price
        cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());


        // Total Cost
        // item one information
        // item two information
        // Total output
        System.out.println("\nTOTAL COST");
        item1.printItemPurchase();
        item2.printItemPurchase();
        System.out.println("Total: $" + cartTotal);
        return;
    }
}