package engineer_korea_lecture.linked_list;

/*
21-03-09
1-3)

단방향 LinkedList 의 끝에서 K 번째 노드를 찾아라

방법2)
재귀호출

 */

public class FindLinkedListDESC_Recursive {
    public static void main(String[] args) {
        Node n = new Node(1);
        for(int i=2;i<10;i++){
            n.append(i);
        }

        int k=3;

        Reference r = new Reference();

        Node solution= solution(n, k,r);
        System.out.println(solution.val);
    }

    private static Node solution(Node n, int k,Reference r) {
        if(n==null) return null;
        Node found  = solution(n.next, k,r);
        r.count++;
        if(r.count==k){
            return n;
        }
        return found;
    }

    static class Reference{
        int count;
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
        void retrieve(){
            Node n = this;
            while(n.next!=null){
                System.out.println("n.val = " + n.val);
                n=n.next;
            }
            System.out.println("n.val = " + n.val);
        }
    }
}
