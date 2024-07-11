package stateDesignPAttern.stateImpl;

import stateDesignPAttern.state.State;

public class UatDbManager implements State {
    @Override
    public State openConnection() {
        return new UatDbManager();
    }

    @Override
    public void insertData() {
        System.out.println("insert data to Uat .....");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close connection for Uat .....");

    }
}
