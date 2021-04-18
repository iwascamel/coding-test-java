package design_pattern.factory_method.concrete;

import design_pattern.factory_method.framework.Item;
import design_pattern.factory_method.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터 베이스 마력 물약의 정보를 가져옴");
    }

    @Override
    protected void createItemLog() {
        System.out.println("로그를 찍겠습니다 " + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
