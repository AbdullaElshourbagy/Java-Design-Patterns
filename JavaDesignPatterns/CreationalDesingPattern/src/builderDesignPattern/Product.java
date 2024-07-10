package builderDesignPattern;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int deliveryDays;

    public static ProductBuilder builder() {
        return new ProductBuilder();
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", deliveryDays=" + deliveryDays +
                '}';
    }

    public static class ProductBuilder {
        private int productId;
        private String productName;
        private double productPrice;
        private int deliveryDays;

        public ProductBuilder() {
        }

        public ProductBuilder(int productId, String productName, double productPrice, int deliveryDays) {
            this.productId = productId;
            this.productName = productName;
            this.productPrice = productPrice;
            this.deliveryDays = deliveryDays;
        }

        public ProductBuilder productId(int productId) {
            this.productId = productId;
            return this;
        }

        public ProductBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public ProductBuilder productPrice(double productPrice) {
            this.productPrice = productPrice;
            return this;
        }

        public ProductBuilder deliveryDays(int deliveryDays) {
            this.deliveryDays = deliveryDays;
            return this;
        }


        public Product build() {
            return new Product(this.productId, this.productName, this.productPrice, this.deliveryDays);
        }

        @Override
        public String toString() {
            return "ProductBuilder{" +
                    "productId=" + productId +
                    ", productName='" + productName + '\'' +
                    ", productPrice=" + productPrice +
                    ", deliveryDays=" + deliveryDays +
                    '}';
        }
    }
}
