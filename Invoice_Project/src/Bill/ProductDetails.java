package Bill;

public class ProductDetails {
    private double price;
    private String taxGroup;

    public ProductDetails(double price, String taxGroup) {
        this.price = price;
        this.taxGroup = taxGroup;
    }

    public double getPrice() {
        return price;
    }

    public String getTaxGroup() {
        return taxGroup;
    }
}
