package abstractFactoryDesignPattern.products.impl;

import abstractFactoryDesignPattern.products.ProductA;

public class ProductA2 implements ProductA {


    @Override
    public int getPrice() {
        return 200;
    }


    @Override
    public double getDiscount() {
        return 0.2;
    }
}
