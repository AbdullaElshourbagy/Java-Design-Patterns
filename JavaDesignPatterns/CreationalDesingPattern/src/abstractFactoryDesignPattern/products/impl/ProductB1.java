package abstractFactoryDesignPattern.products.impl;

import abstractFactoryDesignPattern.products.ProductB;

public class ProductB1 implements ProductB {
    @Override
    public int getPrice() {
        return 300;
    }

    @Override
    public double getDiscount() {
        return 0.3;
    }
}
