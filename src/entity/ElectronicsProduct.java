package entity;

public class ElectronicsProduct  extends  Product{
    private Integer warrantyPeriod;

    public ElectronicsProduct(Long id, String name, Double price, Integer warrantyPeriod) {
        super(id, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicsProduct(Integer warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Integer getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(Integer warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "ElectronicsProduct{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", warrantyPeriod=" + warrantyPeriod +
                '}';
    }

}
