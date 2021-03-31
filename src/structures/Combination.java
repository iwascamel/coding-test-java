package structures;

public class Combination {
    public static void main(String[] args) {
        int combination = combination(10, 2);
        System.out.println(combination);
    }

    private static int combination(int n, int r) {
        if(n==r || r==0) return 1;
        return combination(n-1,r) + combination(n-1,r-1);
    }
}
