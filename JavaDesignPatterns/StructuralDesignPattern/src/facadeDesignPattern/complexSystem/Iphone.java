package facadeDesignPattern.complexSystem;

public class Iphone implements Mobile{
    @Override
    public double getPrice() {
        return 20000;
    }

    @Override
    public String getMobileName() {
        return "Iphone 12 pro max";
    }
}
