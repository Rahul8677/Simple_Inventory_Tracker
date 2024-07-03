import java.util.Scanner;

public class InventoryTracker {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product by Name");
            System.out.println("4. Display Products Needing Restocking");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();

                    Product product = new Product(id, name, quantity, price);
                    inventoryManager.addProduct(product);
                    break;

                case 2:
                    inventoryManager.displayProducts();
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    inventoryManager.searchProductByName(searchName);
                    break;

                case 4:
                    System.out.print("Enter restock threshold: ");
                    int threshold = scanner.nextInt();
                    inventoryManager.displayProductsNeedingRestocking(threshold);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
