package engineer_korea_lecture.queue;

import java.util.NoSuchElementException;

public class QueueStructure {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.offer(1);
        q.offer(2);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.poll());

    }
    static class Queue<T>{
        class Node<T>{
            private T data;
            private Node next;

            public Node(T data){
                this.data=data;
            }
        }

        private Node<T> first;
        private Node<T> last;

        public void offer(T item){
            Node<T> t = new Node<T>(item);

            if(last!=null){
                last.next=t;
            }
            last = t;
            if(first==null){
                first=last;
            }
        }

        public T poll(){
            if(first==null) throw new NoSuchElementException();

            T data = first.data;
            first=first.next;

            if(first==null){
                last=null;
            }
            return data;
        }
        public T peek(){
            if(first==null){
                throw new NoSuchElementException();
            }
            return first.data;
        }
        public boolean isEmpty(){
            return first==null;
        }
    }
}
