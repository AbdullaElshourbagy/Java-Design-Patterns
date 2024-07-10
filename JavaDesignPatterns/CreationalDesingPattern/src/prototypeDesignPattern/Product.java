package prototypeDesignPattern;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    private int deliveryDays;

    private Product(Product product) {
        this.productId = product.productId;
        this.productName = product.productName;
        this.productPrice = product.productPrice;
        this.deliveryDays = product.deliveryDays;
    }

    public Product(int productId, String productName, double productPrice, int deliveryDays) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.deliveryDays = deliveryDays;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(int deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public Product clone() {
        return new Product(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", deliveryDays=" + deliveryDays +
                '}';
    }
}
