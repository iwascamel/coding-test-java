package back_gi_sun_al_lecture.list;

public class LinkedList {

    private Node head;
    private Node tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));

        list.print();
        list.reverse();
        list.print();
        list.reverse();
        list.print();

    }
    void print(){
        Node node = this.head;
        while(node !=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    void add(Node node){
        if(head==null){
            head=node;
            tail=node;
        }else if(tail!=null){
            tail.next =node;
            tail=tail.next;
        }
    }

    // 순차적인 방법
    void reverse(){
        Node current = this.head;
        Node prev = null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        this.tail=this.head;
        // current 는 현재 null
        this.head=prev;
    }

    void reverse_using_recursive(){
        Node head = this.head;
        this.head = reverse_recursive(head);
        this.tail = head;
    }


    Node reverse_recursive(Node node){
        if (node == null || node.next==null){
            return node;
        }

        Node newHead = reverse_recursive(node.next);
        node.next.next = node;
        node.next =null;
        return newHead;
    }

}

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}