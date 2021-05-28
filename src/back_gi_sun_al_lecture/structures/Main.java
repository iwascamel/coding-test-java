package back_gi_sun_al_lecture.structures;

public class Main {
    public static void main(String[] args) throws Exception {
        StackImpl stack = new StackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);


        System.out.println(stack);
    }
}
