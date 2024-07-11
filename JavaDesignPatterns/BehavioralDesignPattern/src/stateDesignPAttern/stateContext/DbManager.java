package stateDesignPAttern.stateContext;

import stateDesignPAttern.state.State;
import stateDesignPAttern.stateImpl.DevDbManager;
import stateDesignPAttern.stateImpl.ProdDbManager;
import stateDesignPAttern.stateImpl.UatDbManager;


public class DbManager implements State {
    private DevDbManager dev;
    private ProdDbManager prod;
    private UatDbManager uat;
    private State state;

    public DbManager(State type) {
        this.state = type;
        this.dev = new DevDbManager();
        this.prod = new ProdDbManager();
        this.uat = new UatDbManager();
    }


    @Override
    public State openConnection() {
        return state;
    }

    @Override
    public void insertData() {
        state.insertData();
    }

    @Override
    public void closeConnection() {
        state.closeConnection();
    }
}
