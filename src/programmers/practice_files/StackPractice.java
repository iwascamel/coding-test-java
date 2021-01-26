package programmers.practice_files;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();

        a.push(1);
        a.push(2);
        a.push(3);

        System.out.println(3==a.pop());
    }
}
