package adapterDesignPattern2.adaptee;

public class ReadingJsonDataFromExternal implements ExternalDataSource {


    @Override
    public String readJsonData() {
        return ("{id:10, name:abdalla ahmed}");
    }
}
