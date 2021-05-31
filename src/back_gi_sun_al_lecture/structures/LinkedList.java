package back_gi_sun_al_lecture.structures;

public class LinkedList {
    Node head;
    Node tail;

    void add(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=tail.next;
        }
    }
    void print(){
        Node current = this.head;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }
    int peek(){
        Node node = this.head;
        while(node.next!=null){
            node=node.next;
        }
        return node.val;
    }

    int pop(){
        Node node = this.head;
        Node prev = this.head;
        while(node.next!=null){
            prev = node;
            node=node.next;
        }
        prev.next = null;
        return node.val;
    }
}
