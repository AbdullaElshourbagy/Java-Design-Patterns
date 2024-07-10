package adapterDesignPattern2.target;

public class ReadingCsv implements DataSources {
    @Override
    public String readData() {
        return ("10,abdalla ahmed,30");
    }
}
