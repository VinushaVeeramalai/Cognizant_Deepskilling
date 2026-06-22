package Week_1.Data_Structures_and_algorithm;
import java.util.Scanner;

class Product {
    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id       = id;
        this.name     = name;
        this.category = category;
    }
}

public class EcommerceSearch {

    // Linear Search - one by one
    static int linearSearch(Product[] p, String target) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].name.equalsIgnoreCase(target))
                return i;
        }
        return -1;
    }

    // Binary Search - split and search (sorted array)
    static int binarySearch(Product[] p, String target) {
        int left = 0, right = p.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = p[mid].name.compareToIgnoreCase(target);
            if (cmp == 0)      return mid;
            else if (cmp < 0)  left  = mid + 1;
            else               right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(1, "Camera", "Electronics"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Phone",  "Electronics"),
            new Product(4, "Tablet", "Electronics"),
            new Product(5, "Watch",  "Accessories")
        };

        System.out.println("=== E-commerce Product Search ===");
        System.out.println("Available: Camera, Laptop, Phone, Tablet, Watch\n");

        System.out.print("Enter product to search: ");
        String target = sc.nextLine();

        // Linear Search
        int r1 = linearSearch(products, target);
        if (r1 >= 0)
            System.out.println("\nLinear Search : Found! ID=" + products[r1].id + ", Category=" + products[r1].category);
        else
            System.out.println("\nLinear Search : Not Found");

        // Binary Search
        int r2 = binarySearch(products, target);
        if (r2 >= 0)
            System.out.println("Binary Search : Found! ID=" + products[r2].id + ", Category=" + products[r2].category);
        else
            System.out.println("Binary Search : Not Found");

        System.out.println("\nLinear Search  -> O(n)     - checks one by one");
        System.out.println("Binary Search  -> O(log n) - splits in half each time");

        sc.close();
    }
}