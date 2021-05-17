package design_pattern.factory_method.framework;

public abstract class ItemCreator {
    // create 함수가 템플릿 메서드와 같은 형태가 된다
    public Item create(){

        Item item;
        // step 1,2,3
        requestItemsInfo();
        createItemLog();
        item = createItem();
        return item;
    }
    // 아이템 생성전 db 에 아이템 정보 요청
    abstract protected void requestItemsInfo();
    // 로그 생성
    abstract protected void createItemLog();
    // 아이템 생성
    abstract protected Item createItem();

}
