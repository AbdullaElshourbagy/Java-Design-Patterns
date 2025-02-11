package flyWeightDesignPattern.flyWeightFactory;

import flyWeightDesignPattern.TreeType;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {


    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color);
            treeTypes.put(name, result);
        }
        return result;
    }
}
