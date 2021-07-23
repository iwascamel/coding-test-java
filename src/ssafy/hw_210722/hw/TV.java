package ssafy.hw_210722.hw;

public class TV extends Product{

    private int inch;
    private String displayType;

    public TV(int productNumber, String name, int price, int quantity, int inch, String displayType) {
        super(productNumber, name, price, quantity);
        this.inch = inch;
        this.displayType = displayType;
    }

    @Override
    public String toString() {
        return "TV의 제품번호 = " + this.getProductNumber()
                + "\t" + "TV의 이름 = " + this.getName()
                + "\t" + "TV의 가격 = " + this.getPrice()
                + "\t" + "TV의 남은 양 = " + this.getQuantity()
                + "\t" + "TV의 인치 = " + this.getInch()
                + "\t" + "TV의 디스플레이 타입 = " + this.getDisplayType();
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
}
