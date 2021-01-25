package PracticeFiles.inflearnPractice.linkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class AddTwoNumbersPractice {
    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(6);
        l2.next.next = new Node(5);

        Node result = solution(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    // 참조값 변경 알아보기.
    private static Node solution(Node l1, Node l2) {
        Node newNode = new Node(0);
        Node p1 = l1, p2 = l2, p3 = newNode;
        int carry = 0;

        while (p1 != null || p2 != null){
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new Node(carry % 10);
            p3 = p3.next;

            carry /= 10;
        }
        if (carry == 1) {
            p3.next = new Node(1);
        }
        return newNode.next;
    }

}
