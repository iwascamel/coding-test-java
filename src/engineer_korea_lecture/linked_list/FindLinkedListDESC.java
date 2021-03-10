package engineer_korea_lecture.linked_list;

/*
21-03-09
1-3)

단방향 LinkedList 의 끝에서 K 번째 노드를 찾아라

방법1)
전체 길이 센 다음에, 앞에서부터 들어가서 몇 번째(K)인지 찾고 전체 길이 - K

 */

public class FindLinkedListDESC {
    public static void main(String[] args) {

        Node node = new Node(1);
        node.append(2);
        node.append(3);
        node.append(4);

        int k=2;
        Node solution = solution(node, k);
        System.out.println(solution.val);
    }

    private static Node solution(Node node, int k) {
        Node n = node;
        int total=0;
        while(n.next!=null){
            n=n.next;
            total++;
        }
        total++;
        n=node;
        // 예시로 따라가보면 범위 값이 정해짐.
        // 만약 total=4, k=2 라면 찾는 값의 위치는 total-k+1 임.
        // i가 1부터인 이유는 노드의 개수를 구하는게 아니라, 화살표의 갯수를 구하는 것이기 때문
        for(int i=1;i<total-k+1;i++){
            n=n.next;
        }
        return n;
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
    }
}
