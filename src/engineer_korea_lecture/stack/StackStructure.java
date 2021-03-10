package engineer_korea_lecture.stack;

import java.util.EmptyStackException;

public class StackStructure {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
    static class Stack<T>{
        class Node<T>{
            private T data;
            private Node<T> next;

            public Node(T data){
                this.data =data;
            }
        }
        private Node<T> top;

        public T pop(){
            if( top == null ) throw new EmptyStackException();

            T item = top.data;
            top = top.next;
            return item;
        }
        public void push(T item){
            Node<T> t = new Node<T>(item);
            t.next = top;
            top=t;
        }
        public T peek(){
            if(top == null){
                throw new EmptyStackException();
            }
            return top.data;
        }
    }
}
