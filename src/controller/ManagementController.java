package controller;

import entity.ClothingProduct;
import entity.ElectronicsProduct;
import entity.Product;
import service.managementService;

import java.util.List;
import java.util.Scanner;

public class ManagementController {

    private managementService service = new managementService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n===== Product & Order Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. List All Products");
            System.out.println("3. Search Product by Name");
            System.out.println("4. Increase All Prices by %");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    Long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Choose Product Type (1 - Electronics, 2 - Clothing): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    Product product;
                    if (type == 1) {
                        System.out.print("Enter Warranty Period (months): ");
                        int warranty = scanner.nextInt();
                        scanner.nextLine();
                        product = new ElectronicsProduct(id, name, price, warranty);
                    } else {
                        System.out.print("Enter Size: ");
                        String size = scanner.nextLine();
                        product = new ClothingProduct(id, name, price, size);
                    }

                    service.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    List<Product> products = service.getAllProducts();
                    System.out.println(products);
                    break;

                case 3:
                    System.out.print("Enter product name keyword: ");
                    String keyword = scanner.nextLine();
                    Product found = service.getProductByName(keyword);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter percentage to increase: ");
                    double percent = scanner.nextDouble();
                    scanner.nextLine();
                    service.increasePrice(percent);
                    System.out.println("All prices increased by " + percent + "%");
                    break;

                case 5:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
