package mementoDesignPattern.memento;

public class FileMemento {
    private String state;

    public FileMemento(String state) {
        this.state=state;
    }
    public String getState() {
        return state;
    }
}
