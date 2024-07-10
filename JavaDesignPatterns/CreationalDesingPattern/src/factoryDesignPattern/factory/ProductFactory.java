package factoryDesignPattern.factory;

import factoryDesignPattern.products.Product;
import factoryDesignPattern.products.impl.ProductA;
import factoryDesignPattern.products.impl.ProductB;

public class ProductFactory {

    public Product getProduct(String productName) {

        if (productName.equals("A")) {
            return new ProductA();

        } else if (productName.equals("B")) {

            return new ProductB();

        }
        throw new RuntimeException(" unsupported product "+productName);
     }
}
