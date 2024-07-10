package adapterDesignPattern2.client;

import adapterDesignPattern2.adaptee.ReadingJsonDataFromExternal;
import adapterDesignPattern2.adapter.DataProviderAdapter;
import adapterDesignPattern2.target.ReadingCsv;
import adapterDesignPattern2.target.ReadingXml;
import adapterDesignPattern2.target.DataSources;

public class AdapterTest {
    public static void main(String[] args) {
        DataSources csv = new ReadingCsv();
        DataSources xml = new ReadingXml();
        DataSources json = new DataProviderAdapter(new ReadingJsonDataFromExternal());

        System.out.println(getData(csv));
        System.out.println(getData(xml));
        System.out.println(getData(json));
    }


    public static String getData(DataSources source) {
        return source.readData();
     }
}
