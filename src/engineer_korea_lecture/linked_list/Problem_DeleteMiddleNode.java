package engineer_korea_lecture.linked_list;

public class Problem_DeleteMiddleNode {
    public static void main(String[] args) {
        Node n = new Node(1);
        for(int i=2;i<10;i++){
            n.append(i);
        }
        solution(n.find(4));
        n.retrieve();
    }

    private static boolean solution(Node n) {
        if(n==null||n.next==null) return false;
        Node next = n.next;
        n.val=next.val;
        n.next=next.next;
        return true;
    }
}
