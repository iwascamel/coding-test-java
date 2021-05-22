package back_gi_sun_al_lecture.practice.linked_list;

public class LinkedList {

    Node head;
    Node tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));

        list.print();
        list.reverse_recursive();
        list.print();
    }

    void add(Node n){
        if(head==null){
            head=n;
            tail=n;
        }else{
            tail.next=n;
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

    void reverse_sequential(){
        Node current = this.head;
        Node next = null;
        Node prev = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }

        this.tail = this.head;
        this.head = prev;
    }

    void reverse_recursive(){
        Node head = this.head;
        this.head = rRecursive(head);
        this.tail = head;
    }
    Node rRecursive(Node node){
        if(node==null || node.next==null){
            return node;
        }
        Node newHead = rRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
}
