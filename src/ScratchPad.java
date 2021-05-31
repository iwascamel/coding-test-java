public class ScratchPad {
    public static void main(String[] args) {

        Dog a = new Dog("A");
        Dog b = new Dog("B");

        swap(a,b);

        System.out.println(a.name);
        System.out.println(b.name);

    }

    static void swap(Dog a, Dog b){
        Dog temp;
        temp =a;
        a=b;
        b=temp;
    }
    static class Dog{
        String name;
        Dog(String name){
            this.name=name;
        }
    }
}

