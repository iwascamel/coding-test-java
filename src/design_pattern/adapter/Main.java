package design_pattern.adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.half(800f));
        System.out.println(adapter.twice(800f));
    }
}
