package stateDesignPAttern.client;

import stateDesignPAttern.state.State;
import stateDesignPAttern.stateContext.DbManager;
import stateDesignPAttern.stateImpl.DevDbManager;
import stateDesignPAttern.stateImpl.ProdDbManager;
import stateDesignPAttern.stateImpl.UatDbManager;

public class StateTest {
    public static void main(String[] args) {
        State prod = new ProdDbManager();
        State uat = new UatDbManager();
        State dev = new DevDbManager();
        System.out.println(" ****** Dev ********");
        DbManager DbManager = new DbManager(dev);
        DbManager.openConnection().insertData();
        DbManager.closeConnection();

        System.out.println(" ****** Uat ********");
        DbManager = new DbManager(uat);
        DbManager.openConnection().insertData();
        DbManager.closeConnection();

        System.out.println(" ****** Prod ********");
        DbManager = new DbManager(prod);
        DbManager.openConnection().insertData();
        DbManager.closeConnection();

    }

}
