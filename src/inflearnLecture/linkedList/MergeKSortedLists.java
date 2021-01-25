package inflearnLecture.linkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


/*
input:
1->4->5
1->3->4
2->6

output:
sorting 후 출력
1->1->2->3->4->5->6

Priority Queue 이용
 */

public class MergeKSortedLists {

    Comparator<ListNode> comp = (o1, o2) -> o1.val-o2.val;

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        MergeKSortedLists a = new MergeKSortedLists();

        List<ListNode> ln = new ArrayList<>();
        ln.add(l1);
        ln.add(l2);
        ln.add(l3);

        ListNode solution = a.solution(ln);

//        while(solution!=null){
//            System.out.println(solution.val);
//            solution=solution.next;
//        }

    }
    public ListNode solution(List<ListNode> lists){
        PriorityQueue<ListNode> queue = new PriorityQueue<>(comp);
        ListNode newHead = new ListNode(0);
        ListNode p = newHead; // data 조작은 p로, 돌려주는 것은 newHead 로 돌려줌

        for (ListNode list : lists) {
            if(list!=null){
                queue.offer(list);

            }
        }

        // 현재 큐에 들어간 값 출력해보면 1 1 2
        // 큐에 들어간 값 -> 맨 앞에 있는 값 비교해서 들어갔음
//        while(!queue.isEmpty()){
//            ListNode node = queue.poll();
//            while(node!=null){
//                System.out.println(node.val);
//                node=node.next;
//            }
//        }

        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            // 이 방식에 집중해서 볼 것.
            p.next=node;
            p=p.next;
            // 현재 큐에 들어간 값이 1 1 2, 하나 뽑았으면 다음거 ( next ) 를 추가해줌.
            if(node.next!=null){
                queue.offer(node.next);
            }
        }
        return newHead.next;
    }
}
