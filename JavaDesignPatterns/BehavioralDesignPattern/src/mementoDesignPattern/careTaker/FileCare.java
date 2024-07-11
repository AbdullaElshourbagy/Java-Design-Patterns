package mementoDesignPattern.careTaker;

import mementoDesignPattern.memento.FileMemento;

import java.util.ArrayList;
import java.util.List;

public class FileCare {
    private List<FileMemento> mementoList = new ArrayList<FileMemento>();

    public void add(FileMemento state) {
        mementoList.add(state);
    }

    public FileMemento get(int index) {
        return mementoList.get(index);
    }
}
