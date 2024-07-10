package abstractFactoryDesignPattern.products.impl;

import abstractFactoryDesignPattern.products.ProductA;

public class ProductA1 implements ProductA {
    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public double getDiscount() {
        return 0.1;
    }
}
