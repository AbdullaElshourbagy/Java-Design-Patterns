package decoratorDesignPAttern.decorator;

import decoratorDesignPAttern.component.DataSources;

public class DataSender implements DataSources {
    private DataSources sources;

    public DataSender(DataSources sources) {
        this.sources = sources;
    }

    @Override
    public String readData() {
        return sources.readData();
    }
}
