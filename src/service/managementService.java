package service;

import dao.ManagementDAO;
import entity.Product;

import java.util.List;

public class managementService {

    private ManagementDAO managementDAO = new ManagementDAO();

    public List<Product> getAllProducts(){
        return  managementDAO.getProducts();
    }
    public Product getProductByName(String name){
        return  managementDAO.getProductByName(name);
    }

    public void addProduct(Product product){
        managementDAO.addProduct(product);
    }

    public  void increasePrice(Double percent){
        managementDAO.increasePrices(percent);
    }
}
