package abstractFactoryDesignPattern.products.impl;

 import abstractFactoryDesignPattern.products.ProductB;

public class ProductB2 implements ProductB {


    @Override
    public int getPrice() {
        return 400;
    }


    @Override
    public double getDiscount() {
        return 0.4;
    }
}
