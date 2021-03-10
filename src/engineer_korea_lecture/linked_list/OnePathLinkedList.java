package engineer_korea_lecture.linked_list;

/*
21-03-09
1-1)

while(n.next!=null) => CRUD 에서 핵심
 */


public class OnePathLinkedList {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.append(2);
        n.append(3);
        n.append(3);
        n.append(4);

        n.retrieve();

        n.delete(1);

        n.retrieve();

    }

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
        void append(int d){
            Node end = new Node(d);
            Node n = this;
            while(n.next!=null){
                n=n.next;
            }
            n.next=end;
        }
        void delete(int d){
            Node n = this;
            while(n.next!=null){
                if(n.next.val==d){
                    n.next=n.next.next;
                }else{
                    n=n.next;
                }
            }
        }
        void retrieve(){
            Node n = this;
            while(n.next!=null){
                System.out.println("n.val -> " + n.val);
                n=n.next;
            }
            System.out.println(n.val);
        }

    }
}
