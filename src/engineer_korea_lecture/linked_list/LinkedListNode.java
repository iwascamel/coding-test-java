package engineer_korea_lecture.linked_list;

/*
21-03-09
1-2)

그냥 node 들만 두면 첫번째 값을 지웠을 때 문제가 발생함
그래서 header 를 두고, header 가 node 를 가르키게 설계한다.

참조값 전달 방식 활용
 */

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedList ln = new LinkedList();
        ln.append(1);
        ln.append(1);
        ln.append(3);
        ln.append(3);
        ln.append(3);

        ln.removeDups();
        ln.retrieve();
    }
    static class LinkedList{
        Node header;
        static class Node{
            int data;
            Node next = null;
        }
        LinkedList(){
            header = new Node();
        }

        void append(int d){
            Node n = header;
            while(n.next!=null){
                n= n.next;
            }
            Node end = new Node();
            end.data = d;
            n.next=end;
        }
        void delete(int d){
            Node n = header;
            while(n.next!=null){
                if(n.next.data==d){
                    n.next=n.next.next;
                }else{
                    n=n.next;
                }
            }
        }
        void retrieve(){
            Node n = header.next;
            while(n.next!=null){
                System.out.println("n.data -> " + n.data);
                n=n.next;
            }
            System.out.println("n.data -> " + n.data);
        }


        /*
        버퍼를 사용하지 않고 중복되는 값 삭제하는 방법
        pointer 를 이용 ( 강좌에서는 러너라고 부름 )
         */

        void removeDups(){
            Node n = header;
            while(n!=null &&n.next!=null){
                Node r = n;
                while(r.next!=null){
                    if(n.data==r.next.data){
                        r.next=r.next.next;
                    }else{
                        r=r.next;
                    }
                }
                n=n.next;
            }
        }
    }
}
