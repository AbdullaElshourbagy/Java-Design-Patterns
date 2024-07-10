package singletonDesignPattern;

public class SingletonTest {
    public static void main(String[] args) {
        // this line didn't run because our constructor here is private
        //Product product1= new Product("Mobile");
        Product product = Product.getInstance("Mobile");
        System.out.println(product.toString());

        // value of product name will not be changed
        Product product1 = Product.getInstance("Tablet");
        System.out.println(product1.toString());

        product.setProductName("Laptop");
        System.out.println(product.toString());
        // after change value from setter methods value for new object will still in old state
        Product product2 = Product.getInstance("Tablet");
        System.out.println(product2.toString());


    }


}
