package stateDesignPAttern.stateImpl;

import stateDesignPAttern.state.State;

public class ProdDbManager implements State {
    @Override
    public State openConnection() {
        return new ProdDbManager();
    }

    @Override
    public void insertData() {
        System.out.println("insert data to prod .....");
    }

    @Override
    public void closeConnection() {
        System.out.println("Close connection for prod .....");

    }
}
