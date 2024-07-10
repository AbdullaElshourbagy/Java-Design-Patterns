package adapterDesignPattern2.adapter;

import adapterDesignPattern2.target.DataSources;
import adapterDesignPattern2.adaptee.ExternalDataSource;

public class DataProviderAdapter implements DataSources {
    private ExternalDataSource sources;

    public DataProviderAdapter(ExternalDataSource sources) {
        this.sources = sources;
    }

    @Override
    public String readData() {
        return sources.readJsonData();
    }
}
