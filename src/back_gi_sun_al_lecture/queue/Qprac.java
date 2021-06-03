package back_gi_sun_al_lecture.queue;

import java.util.NoSuchElementException;

public class Qprac<T> {
    class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }

    Node<T> first;
    Node<T> last;

    void offer(T data){
        Node<T> node = new Node<T>(data);
        if(last !=null){
            last.next=node;
        }
        last=node;
        if(first==null){
            first=last;
        }
    }
    T poll(){
        if(first==null){
            throw new NoSuchElementException();
        }
        T data = first.data;
        first=first.next;
        if(first==null){
            last=null;
        }
        return data;
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
