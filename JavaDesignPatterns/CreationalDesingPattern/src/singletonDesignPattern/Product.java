package singletonDesignPattern;

public class Product {
    private String productName;

    private static Product instance;

    private Product(String productName) {
        this.productName = productName;
    }


    public static Product getInstance(String productName) {
        if (instance == null) {
            instance = new Product(productName);
        }
        return instance;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
