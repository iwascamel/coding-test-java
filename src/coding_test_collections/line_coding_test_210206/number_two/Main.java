package coding_test_collections.line_coding_test_210206.number_two;

public class Main {
    public static void main(String[] args) {

    }

    static void intersection(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int px = (x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4);
        int py = (x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4);
        int p = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (p == 0) {
            System.out.println("parallel");
            return;
        }
        int x = px / p;
        int y = py / p;
        System.out.println(x + ", " + y);
    }

}
