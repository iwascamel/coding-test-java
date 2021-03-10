package engineer_korea_lecture.linked_list;

/*
21-03-09
1-3)

단방향 LinkedList 의 끝에서 K 번째 노드를 찾아라

방법3)
포인터 이용
 */

public class FindLinkedListDESC_Pointer {
    public static void main(String[] args) {
        Node n = new Node(1);
        for(int i=2;i<10;i++){
            n.append(i);
        }
        int k = 3;

        Node solution = solution(n, k);
        System.out.println(solution.val);
    }

    private static Node solution(Node n, int k) {
        Node p1 = n;
        Node p2 = n;

        for(int i=0;i<k;i++){
            if(p1==null) return null;
            p1=p1.next;
        }

        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        void append(int k){
            Node end = new Node(k);
            Node n = this;
            while(n.next!=null){
                n=n.next;
            }
            n.next=end;
        }
        void retrieve(){
            Node n = this;
            while(n.next!=null){
                System.out.println(n.val);
                n=n.next;
            }
            System.out.println(n.val);
        }
        void delete(int k){
            Node n = this;
            while(n.next!=null){
                if(n.val==k){
                    n.next=n.next.next;
                }else{
                    n=n.next;
                }
            }
        }
    }
}
