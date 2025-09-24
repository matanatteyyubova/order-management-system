package entity;

public class ClothingProduct extends Product {
    private  String  size;

    public ClothingProduct(Long id, String name, Integer price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public ClothingProduct(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ClothingProduct{" +
                "size='" + size + '\'' +
                '}';
    }
}
