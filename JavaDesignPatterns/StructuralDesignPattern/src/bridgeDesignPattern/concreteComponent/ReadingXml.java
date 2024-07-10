package bridgeDesignPattern.concreteComponent;

import bridgeDesignPattern.bridge.DataSources;
import bridgeDesignPattern.appBusiness.DataSender;

public class ReadingXml extends DataSources {
    public ReadingXml(DataSender dataSender) {
        super(dataSender);
    }

    @Override
    public String readData() {
        return dataSender.sendData()+"<id>10</id> <name> abdalla ahmed </name>";
    }
}
