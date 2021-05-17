package design_pattern.factory_method.concrete;

import design_pattern.factory_method.framework.Item;
import design_pattern.factory_method.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator itemCreator;
        Item item;

        itemCreator = new HpCreator();
        item = itemCreator.create();
        item.use();

        itemCreator = new MpCreator();
        item = itemCreator.create();
        item.use();
    }
}
