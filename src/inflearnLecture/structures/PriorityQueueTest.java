package inflearnLecture.structures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public static void main(String[] args) {

        Comparator<ListNode> comp = (o1, o2)->o1.val-o2.val;

        PriorityQueue<ListNode> lq = new PriorityQueue<>(comp);

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;

        lq.offer(l1);
        lq.offer(l2);
        lq.offer(l3);
        lq.offer(l4);

        while(!lq.isEmpty()){
            System.out.println(lq.peek().val);
            lq.poll();
        }
    }
}
