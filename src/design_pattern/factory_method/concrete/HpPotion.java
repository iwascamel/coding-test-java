package design_pattern.factory_method.concrete;

import design_pattern.factory_method.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
