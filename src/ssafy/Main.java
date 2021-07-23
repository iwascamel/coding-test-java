package ssafy;

class A{
    void print(){
        System.out.println("A");
    }
}

class B extends A{
    void print(){
        System.out.println("B");
    }
}

class C extends A{
    void print(){
        System.out.println("C");
    }
}

public class Main{
    public static void main(String args[]) {
        B a = new B();
        C c = new C();

    }
}