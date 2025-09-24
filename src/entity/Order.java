package entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private  Long orderId;
    private  String customerName;
    private List<Product> products = new ArrayList<>();

    public Order(Long orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;

    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

     public void addProduct(Product product){
         products.add(product);
     }
}
