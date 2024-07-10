package abstractFactoryDesignPattern.creator;

import abstractFactoryDesignPattern.products.ProductA;
import abstractFactoryDesignPattern.products.ProductB;

public class FactoryTest {
    public static void main(String[] args) {

        ProductA productA = new ProductCreator().getFactory("A").getProductA("A1");
        System.out.println("product A1 price >>  " + productA.getPrice());
        System.out.println("product A1 discount >>  " + productA.getDiscount());

        productA = new ProductCreator().getFactory("A").getProductA("A2");
        System.out.println("product A2 price >>  " + productA.getPrice());
        System.out.println("product A2 discount >>  " + productA.getDiscount());

        ProductB productB = new ProductCreator().getFactory("B").getProductB("B1");
        System.out.println("product B1 price >>  " + productB.getPrice());
        System.out.println("product B1 discount >>  " + productB.getDiscount());

        productB = new ProductCreator().getFactory("B").getProductB("B2");
        System.out.println("product B2 price >>  " + productB.getPrice());
        System.out.println("product B2 discount >>  " + productB.getDiscount());


// these two line will raise the errors that will throws before when development
//        productB = new ProductCreator().getFactory("C").getProductB("A1");
//        productB = new ProductCreator().getFactory("B").getProductB("A1");


    }
}
