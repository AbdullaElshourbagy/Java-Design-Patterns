package builderDesignPattern;

public class BuilderTest {

    public static void main(String[] a) {
        Product product = Product.builder().productId(10).productName("Mobile").productPrice(5000).build();
        System.out.println(product.toString());


        product = Product.builder().productId(10).productName("Mobile").productPrice(5000).deliveryDays(2).build();
        System.out.println(product.toString());
    }
}
