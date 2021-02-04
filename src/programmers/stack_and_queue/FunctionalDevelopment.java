package programmers.stack_and_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FunctionalDevelopment {
    public static void main(String[] args) {
        int progresses[] = {93,30,55};
        int speeds[] = {1,30,5};

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<speeds.length;i++){
            queue.offer(speeds[i]);
        }

        while(!queue.isEmpty()){
            int count=0;

            for(int i=0;i<progresses.length;i++){
                progresses[i] += speeds[i];
                if(progresses[i]>=100){
                     stack.push(progresses[i]);
                     speeds[i]=-1;
                }
            }
            if(!stack.isEmpty()){
                if(stack.pop().equals(queue.peek())){
                    count++;
                    stack.pop();
                    queue.poll();
                }
            }
            arrayList.add(count);
        }

        int result[] = new int[arrayList.size()];

        for(int i=0;i<arrayList.size();i++){
            result[i] = arrayList.get(i);
        }

        for(int i:result){
            System.out.println(i);
        }
    }
}
