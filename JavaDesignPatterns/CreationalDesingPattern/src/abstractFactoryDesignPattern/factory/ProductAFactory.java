package abstractFactoryDesignPattern.factory;

import abstractFactoryDesignPattern.products.ProductA;
import abstractFactoryDesignPattern.products.ProductB;
import abstractFactoryDesignPattern.products.impl.ProductA1;
import abstractFactoryDesignPattern.products.impl.ProductA2;


public class ProductAFactory extends AbstractProductFactory{

    public ProductA getProductA(String productName) {

        if (productName.equals("A1")) {
            return new ProductA1();
        } else if (productName.equals("A2")) {
            return new ProductA2();
        }
        throw new RuntimeException(" unsupported product " + productName);
    }

    @Override
    public ProductB getProductB(String productName) {
        return null;
    }
}
