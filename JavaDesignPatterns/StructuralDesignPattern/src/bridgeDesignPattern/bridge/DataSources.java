package bridgeDesignPattern.bridge;

import bridgeDesignPattern.appBusiness.DataSender;

public abstract class DataSources {
    public DataSender dataSender;

  public DataSources(DataSender dataSender) {
    this.dataSender = dataSender;
  }

  public abstract String readData();
}
