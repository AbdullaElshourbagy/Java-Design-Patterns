package stateDesignPAttern.stateImpl;

import stateDesignPAttern.state.State;

public class DevDbManager implements State {
    @Override
    public State openConnection() {
        return new DevDbManager();
    }

    @Override
    public void insertData() {
        System.out.println("insert data to Dev .....");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close connection for Dev .....");

    }
}
