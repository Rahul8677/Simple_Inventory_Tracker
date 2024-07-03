import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products;

    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void displayProductsNeedingRestocking(int threshold) {
        for (Product product : products) {
            if (product.getQuantity() < threshold) {
                System.out.println(product);
            }
        }
    }
}
