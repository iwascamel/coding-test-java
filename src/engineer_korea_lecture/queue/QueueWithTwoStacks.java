package engineer_korea_lecture.queue;

import java.util.Stack;

public class QueueWithTwoStacks {
    public static void main(String[] args) {
        CustomQueue q= new CustomQueue();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.peek());

    }

    static class CustomQueue {
        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();

        void offer(int k) {
            firstStack.push(k);
        }

        Integer poll() {
            if (secondStack.isEmpty()) {
                while(!firstStack.isEmpty()){
                    secondStack.push(firstStack.pop());
                }
            }
            return secondStack.pop();
        }

        Integer peek() {
            if (secondStack.isEmpty()) {
                while(!firstStack.isEmpty()){
                    secondStack.push(firstStack.pop());
                }
            }
            return secondStack.peek();
        }
    }
}
