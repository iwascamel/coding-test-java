
public class ScratchPad {
    public static void main(String[] args) {
        A a = new A();
        a.number=5;

        m(a);
        System.out.println(a.number);
    }
    static class A{
        int number;
    }
    static void m(A a){
        A b = a;
        b.number = 4;
    }
}


