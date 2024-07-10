package prototypeDesignPattern;


public class PrototypeTest {

    public static void main(String[] a) {
        Product product = new Product(1, "Mobile", 5000, 1);
        System.out.println(product.toString());


        System.out.println( " **********   after clone *****");
        Product product1 = product.clone();
        System.out.println(product1.toString());
    }
}
