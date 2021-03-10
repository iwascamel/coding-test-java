package engineer_korea_lecture.linked_list;

/*
첫번째 노드를 빼려면 Header 있는 Node 로 재구현 해야한다.
 */

public class FindCrossingPoint {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = n1.addNext(2);
        Node n3 = n1.addNext(3);
        Node n4 = n1.addNext(4);
        Node n5 = n1.addNext(5);

        Node m1 = new Node(6);
        Node m2 = m1.addNext(8);
        m2.linking(n4);

        solution(n1,m1);
    }

    private static void solution(Node n1, Node n2) {
        int len1 = n1.getLength();
        int len2 = n2.getLength();

        if(len1>len2){

        }

    }
}
