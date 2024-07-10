package abstractFactoryDesignPattern.factory;

import abstractFactoryDesignPattern.products.ProductA;
import abstractFactoryDesignPattern.products.ProductB;

public abstract class AbstractProductFactory {

    public abstract ProductA getProductA(String productName);
    public abstract ProductB getProductB(String productName);
}
