package mementoDesignPattern.orginator;

import mementoDesignPattern.client.MementoTest;
import mementoDesignPattern.memento.FileMemento;

public class FileOriginator {
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    public FileMemento saveStateToMemento(){
        return new FileMemento(state);
    }

    public void getStateFromMemento(FileMemento Memento){
        state = Memento.getState();
    }
}
