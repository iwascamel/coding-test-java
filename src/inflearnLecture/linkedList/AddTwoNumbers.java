package inflearnLecture.linkedList;

/*
input : 2->4->3
input : 5->6->2

output : 7 0 6 (carry 발생)

node -> 앞에 노드를 만들어서, p3.next = new Node , p3=p3.next 하는 방식이 포인트
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(6);

        ListNode node = solve(l1, l2);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    private static ListNode solve(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);

        ListNode p1 = l1, p2 = l2, p3 = newHead;
        int carry = 0;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry = carry + p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry = carry + p2.val;
                p2 = p2.next;
            }

            p3.next=new ListNode(carry%10);
            p3=p3.next;

            // 캐리 저장
            carry/=10;
        }
        if(carry==1){
            p3.next=new ListNode(1);
        }

        return newHead.next;
    }
}
