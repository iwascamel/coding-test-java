package inflearn_lecture.linkedList;


/*
말 그대로 reverse 된 LinkedList 를 만들어라

핵심 : 말로 먼저 표현하고, 그 다음에 코드로 옮길 것

1->2->3->null 이 있을 때

3->2->1->null 이 돼야 하는데, 3부터 생각하면 망하는 것. 1에 null 을 넣어주고, 2의 next 에 1을 넣어주는 식으로 거꾸로 올라가야 한다.


next=c.next 현재의 next 를 옮겨놓음
c.next=prev 현재의 next 가 prev (초기에는 null) 을 가르키게 함 ( 여기서 연결 )
prev=c 옮긴애를 전애걸로 설정
c=next 다음거를 설정하기 위해 설정
 */


public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode li = new ListNode(1);
        li.next = new ListNode(2);
        li.next.next = new ListNode(3);
        li.next.next.next = new ListNode(5);
        li.next.next.next.next = new ListNode(9);

        ListNode solution = solution(li);

        while(solution!=null){
            System.out.println(solution.val);
            solution=solution.next;
        }
    }
    public static ListNode solution(ListNode li){
        ListNode prev = null;
        ListNode next = null;
        while(li!=null){
            next=li.next;
            li.next=prev;
            prev=li;
            li=next;
        }
        return prev;
    }
}
