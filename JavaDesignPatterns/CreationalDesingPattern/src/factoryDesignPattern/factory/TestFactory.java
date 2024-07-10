package factoryDesignPattern.factory;

import factoryDesignPattern.products.Product;

public class TestFactory {
    public static void main(String[] args) {

        Product product = new ProductFactory().getProduct("A");
        System.out.println("product A price >>  " + product.getPrice());
        System.out.println("product A discount >>  " + product.getDiscount());


        product = new ProductFactory().getProduct("B");
        System.out.println("product B price >>  " + product.getPrice());
        System.out.println("product B discount >>  " + product.getDiscount());
// this line will raise the errors that will throws before when development

        // product = new ProductFactory().getProduct("C");


    }
}
