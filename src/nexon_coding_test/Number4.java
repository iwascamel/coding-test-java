package nexon_coding_test;

import java.io.IOException;
import java.util.Stack;

public class Number4 {
    public static void main(String[] args) throws IOException {
        Result a = new Result();

        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        int k=3;
        Solution b= new Solution();
        int solution = b.solution(stack, k);
        System.out.println(solution);
    }
    int solution(Stack<Integer> stack,int k){
        int result=0;
        while(true){
            System.out.println(stack.toString());

            for(int i=0;i<stack.size();i++){
                if(stack.get(i)>k) {
                    break;
                }else{
                    result++;
                    break;
                }
            }

            int temp = stack.pop();
            if(temp!=1){
                stack.push(temp-1);
                stack.push(1);
            }else{
                int sum=2;
                for(;!stack.isEmpty()&&stack.peek()==1;stack.pop()){
                    sum++;
                }
                if(stack.isEmpty()) break;
                int pivot = stack.pop()-1;
                stack.push(pivot);
                while(sum>pivot){
                    stack.push(pivot);
                    sum -=pivot;
                }
                stack.push(sum);
            }
        }
        return result;
    }
}
