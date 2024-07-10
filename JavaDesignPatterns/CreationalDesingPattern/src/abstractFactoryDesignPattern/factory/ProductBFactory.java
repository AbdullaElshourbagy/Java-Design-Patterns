package abstractFactoryDesignPattern.factory;


import abstractFactoryDesignPattern.products.ProductA;
import abstractFactoryDesignPattern.products.ProductB;
import abstractFactoryDesignPattern.products.impl.ProductB1;
import abstractFactoryDesignPattern.products.impl.ProductB2;


public class ProductBFactory extends AbstractProductFactory {


    public ProductB getProductB(String productName) {

        if (productName.equals("B1")) {
            return new ProductB1();
        } else if (productName.equals("B2")) {
            return new ProductB2();
        }
        throw new RuntimeException(" unsupported product " + productName);
    }


    @Override
    public ProductA getProductA(String productName) {
        return null;
    }
}
