package factoryDesignPattern.products.impl;

import factoryDesignPattern.products.Product;

public class ProductB implements Product {


    @Override
    public int getPrice() {
        return 100;
    }


    @Override
    public double getDiscount() {
        return 0.1;
    }
}
