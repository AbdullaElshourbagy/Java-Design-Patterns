package factoryDesignPattern.products.impl;

import factoryDesignPattern.products.Product;

public class ProductA implements Product {
    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public double getDiscount() {
        return 0.2;
    }
}
