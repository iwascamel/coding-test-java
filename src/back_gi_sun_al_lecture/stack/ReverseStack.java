package back_gi_sun_al_lecture.stack;

import java.util.Stack;

// 스택뒤집기
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        System.out.println(reverse_using_stack(stack));
    }

    static Stack<Integer> reverse_using_stack(Stack<Integer> stack){
        Stack<Integer> reversedStack = new Stack<>();

        while(!stack.isEmpty()){
            reversedStack.push(stack.pop());
        }
        return reversedStack;
    }

    static void reverse_using_recursive(Stack<Integer> stack){
        if (stack.isEmpty()) return;
        int temp = stack.pop();
        reverse_using_stack(stack);
        insert_at_bottom(stack,temp);
    }

    private static void insert_at_bottom(Stack<Integer> stack, int number) {
        if (stack.isEmpty()){
            stack.push(number);
        }else{
            int temp = stack.pop();
            insert_at_bottom(stack,number);
            stack.push(temp);
        }
    }

}
