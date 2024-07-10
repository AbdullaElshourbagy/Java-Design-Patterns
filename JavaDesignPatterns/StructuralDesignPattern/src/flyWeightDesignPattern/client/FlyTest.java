package flyWeightDesignPattern.client;

import flyWeightDesignPattern.flyWeightFactory.Forest;

public class FlyTest {


    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.createTree(10, 20,
                "Summer Oak", "GREEN");
        forest.createTree(20, 50,
                "Autumn  Oak", "Marrow");
        forest.createTree(100, 200,
                "Summer Oak", "GREEN");


        forest.trees.stream().forEach(tree -> System.out.println(tree.toString()));
    }
}
