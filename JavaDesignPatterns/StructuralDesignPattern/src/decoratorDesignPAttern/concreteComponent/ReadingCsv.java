package decoratorDesignPAttern.concreteComponent;

import decoratorDesignPAttern.component.DataSources;

public class ReadingCsv implements DataSources {
    @Override
    public String readData() {
        return ("10,abdalla ahmed,30");
    }
}
