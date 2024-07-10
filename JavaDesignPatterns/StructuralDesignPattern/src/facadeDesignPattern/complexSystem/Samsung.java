package facadeDesignPattern.complexSystem;

public class Samsung implements Mobile{
    @Override
    public double getPrice() {
        return 30000;
    }

    @Override
    public String getMobileName() {
        return "Samsung ultra";
    }
}
