package ssafy.hw_210722.hw;

public class Refrigerator extends Product{

    private int size;

    public Refrigerator(int productNumber, String name, int price, int quantity, int size) {
        super(productNumber, name, price, quantity);
        this.size = size;
    }

    @Override
    public String toString() {
        return "냉장고의 제품번호 = " + this.getProductNumber()
                + "\t" + "냉장고의 이름 = " + this.getName()
                + "\t" + "냉장고의 가격 = " + this.getPrice()
                + "\t" + "냉장고가 남은 양 = " + this.getQuantity()
                + "\t" + "냉장고의 크기 = " + this.getSize();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
