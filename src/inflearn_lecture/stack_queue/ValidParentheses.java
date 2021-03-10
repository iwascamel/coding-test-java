package inflearn_lecture.stack_queue;


/*
괄호에 있는 값을 저장 & 계산할 때 -> stack 을 이용

닫힌 괄호를 만나면 뺀다
 */


import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String ex1 = "([)]";
        String ex2 = "{}[]()";
        String ex3 = "([{][]})";
        System.out.println(solution(ex3));
    }

    private static boolean solution(String s) {

        if(s.length()%2!=0) return false;

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{') stack.pop();
                    break;
                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }
    return stack.isEmpty();
    }
}

