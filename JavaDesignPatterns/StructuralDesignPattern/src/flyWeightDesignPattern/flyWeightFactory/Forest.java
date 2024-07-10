package flyWeightDesignPattern.flyWeightFactory;

import flyWeightDesignPattern.concreteClasses.Tree;
import flyWeightDesignPattern.concreteClasses.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Forest {


    public List<Tree> trees = new ArrayList<>();

    public void createTree(int x, int y, String name, String color) {
        TreeType type = TreeFactory.getTreeType(name, color);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }




}
