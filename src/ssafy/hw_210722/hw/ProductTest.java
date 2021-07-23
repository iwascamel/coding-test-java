package ssafy.hw_210722.hw;

public class ProductTest {
    public static void main(String[] args) {
        Product tv = new TV(1001,"삼성 티비", 500000, 5, 32, "IPS");
        Product refrigerator = new Refrigerator(101,"삼성 냉장고",20000,2,30);

        System.out.println("tv의 가격 = " + tv.getPrice());
        System.out.println("냉장고의 가격 = " + refrigerator.getPrice());

        System.out.println(tv);
        System.out.println(refrigerator);
    }
}
