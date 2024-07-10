package abstractFactoryDesignPattern.creator;

import abstractFactoryDesignPattern.factory.AbstractProductFactory;
import abstractFactoryDesignPattern.factory.ProductAFactory;
import abstractFactoryDesignPattern.factory.ProductBFactory;

public class ProductCreator {

    public AbstractProductFactory getFactory(String factory) {
        if (factory.equals("A")) {
            return new ProductAFactory();
        } else if (factory.equals("B")) {
            return new ProductBFactory();
        }
        throw new RuntimeException("product factory un supported");
    }
}
