public class ScratchPad {
    public static void main(String[] args) {

        Dog a = new Dog("A");
        Dog b = a;

        foo(a);

        System.out.println(a.name);
        System.out.println(b.name);

    }
    static class Dog{
        String name;

        Dog(String name){
            this.name=name;
        }
    }

    static void foo(Dog d){
        d = new Dog("C");
    }
}

