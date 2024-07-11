package templateDesignPattern.template;

public abstract class DbOperation {

    public void showDbOperations() {
        insertOperation();
        updateOperation();
        deleteOperation();
    }

    public abstract void insertOperation();

    public abstract void updateOperation();

    public abstract void deleteOperation();

}
