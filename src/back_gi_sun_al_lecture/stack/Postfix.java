package back_gi_sun_al_lecture.stack;

/*
123+-5*
stack 사용

s : 123
+ 만남
s에서 2개 꺼내서 연산
2+3 = 5
연산한거 안에 넣어줌
s : 15
- 만남
s에서 2개 꺼내서 연산
s : -4
s : -4 5
* 만남
s에서 2개 꺼내서 연산
s : -20
끝났으니 -20 return
 */

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        System.out.println(solution("123+-5*"));
    }
    static Integer solution(String s){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }else{

                int right = stack.pop();
                int left = stack.pop();

                switch (c) {
//                    case '+' -> stack.push(left + right);
//                    case '-' -> stack.push(left - right);
//                    case '*' -> stack.push(left * right);
//                    case '/' -> stack.push(left / right);
                }
            }
        }

        return stack.peek();
    }
}
