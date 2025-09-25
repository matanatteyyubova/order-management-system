package dao;

import entity.Order;
import entity.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementDAO {
    public Map<Long , Product> products = new HashMap<>();
    public List<Order> orders = new ArrayList<>();



    public void addProduct(Product product){
        products.put(product.getId(),product);
    }

    public List<Product> getProducts(){
        return  new ArrayList<>(products.values());
    }

    public Product getProductByName(String name){
        return  products.values().stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    public List<Product> increasePrices(double percent) {
        return products.values().stream()
                .map(product -> {
                    Double newPrice = product.getPrice() * (1 + percent / 100);
                    product.setPrice(newPrice);
                    return product;
                })
                .toList();
    }



}
