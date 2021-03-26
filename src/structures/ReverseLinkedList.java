package structures;


public class ReverseLinkedList {
    static class LinkedList{
        Node header;
        static class Node{
            int val;
            Node next;
            Node(int val){
                this.val=val;
            }
        }
        void append(int n){
            Node node = new Node(n);
            if (header != null) {
                node.next = header;
            }
            header=node;
        }
        void search(){
            Node node = header;
            while(node.next!=null){
                int n =node.val;
                System.out.println(n);
                node=node.next;
            }
            System.out.println(node.val);
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);

        l.search();
    }
}
