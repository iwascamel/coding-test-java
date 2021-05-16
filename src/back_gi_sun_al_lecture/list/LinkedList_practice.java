package back_gi_sun_al_lecture.list;

public class LinkedList_practice {

    Node head;
    Node tail;

    public static void main(String[] args) {
        LinkedList_practice list = new LinkedList_practice();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));

        list.print();

        list.reverse();
        list.print();

    }
    void add(Node node){
        if (head == null ){
            head = node;
            tail = node;
        }else if(tail!=null){
            tail.next = node;
            tail=tail.next;
        }
    }
    void print(){
        Node node = head;
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    void reverse(){
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }
        tail = head;
        head = prev;
    }
}

