public class ScratchPad {
    public static void main(String[] args) {
        Integer a =5;
        B b = new B();
        b.score=3;
        solution(b);
        System.out.println(b.score);
    }

    static class B{
        int score;
    }
    private static void solution(B bb) {
        bb.score=5;
    }
}


