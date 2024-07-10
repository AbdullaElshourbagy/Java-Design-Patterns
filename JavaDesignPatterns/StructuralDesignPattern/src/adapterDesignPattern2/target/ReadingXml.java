package adapterDesignPattern2.target;

public class ReadingXml implements DataSources {
    @Override
    public String readData() {
        return("<id>10</id> <name> abdalla ahmed </name>");
    }
}
