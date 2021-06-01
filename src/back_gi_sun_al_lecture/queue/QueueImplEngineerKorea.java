package back_gi_sun_al_lecture.queue;

import java.util.NoSuchElementException;

// 21.06.01
//https://www.youtube.com/watch?v=W3jNbNGyjMs

public class QueueImplEngineerKorea<T> {
    class Node<T>{
        private T data;
        private Node<T> next;
        Node(T data){
            this.data=data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void offer(T item){
        Node<T> t= new Node<T>(item);

        if(last!=null){
            last.next=t;
        }
        last=t;
        if(first==null){
            first=last;
        }
    }

    public T poll(){
        if(first==null){
            throw new NoSuchElementException();
        }
        T data = first.data;
        first = first.next;
        if (first==null){
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> node = this.first;
        while(node!=null){
            sb.append(node.data);
            if(node.next!=null){
                sb.append(",");
            }
            node=node.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
