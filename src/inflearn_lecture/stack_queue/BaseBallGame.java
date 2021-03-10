package inflearn_lecture.stack_queue;

/*
모두 더하기
C , D , + 일 때는 특수효과
 */

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {

        String[] str = {"5","-2","4","C","D","9","+","+"};
        System.out.println(solution(str));
    }

    private static int solution(String[] str) {

        Stack<Integer> stack = new Stack<>();

        for(String s : str){
            switch(s){
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                case "+":
                    int x = stack.pop();
                    int y = stack.pop();
                    int z = x+y;
                    stack.push(y);
                    stack.push(x);
                    stack.push(z);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
