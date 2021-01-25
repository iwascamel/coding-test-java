package inflearnLecture.structures;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}
public class LinkedListTest {
    public static void main(String[] args) {
        ListNode li = new ListNode(1);
        li.next=new ListNode(2);
        li.next.next=new ListNode(3);
        li.next.next.next=new ListNode(4);

        while(li!=null){
            System.out.println(li.val);
            li=li.next;
        }
    }
}
