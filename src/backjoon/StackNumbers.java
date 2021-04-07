package backjoon;

// 백준 1874번 스택수열 // 실패

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<N;i++){
            queue.offer(sc.nextInt());
        }

        Queue<String> solution = solution(queue);


        while(!solution.isEmpty()){
            String temp = solution.poll();
            System.out.println(temp);
        }
    }

    private static Queue<String> solution(Queue<Integer> queue) {
        int data = queue.poll();
        Stack<Integer> stack = new Stack<>();
        Queue<String> result = new LinkedList<>();
        stack.push(1);
        result.offer("+");
        int i=2;

        if(queue.size()==1 && data==1){
            result.offer("+");
            return result;
        }else if(queue.size() == 1){
            result.offer("NO");
            return result;
        }

        while(!queue.isEmpty()){
            if(stack.peek() < data ){
                stack.push(i++);
                result.offer("+");
            }else if(stack.peek()==data){
                data=queue.poll();
                result.offer("-");
                stack.pop();
            }else if(stack.peek()>data){
                result.offer("NO");
                return result;
            }
        }
        return result;
    }
}
