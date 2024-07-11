package stateDesignPAttern.state;

public interface State {

    State openConnection();

    void insertData();

    void closeConnection();
}
