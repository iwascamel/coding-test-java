package engineer_korea_lecture.linked_list;

/*
21-03-10

심화문제

토끼와 거북이
https://www.youtube.com/watch?v=AWWxMl9-8CY
 */

public class FindLoopBeginNode {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = n1.addNext(2);
        Node n3 = n1.addNext(3);
        Node n4 = n1.addNext(4);
        Node n5 = n1.addNext(5);
        Node n6 = n1.addNext(6);
        n6.linking(n4);

        Node solution = solution(n1);

        System.out.println(solution.val);
    }

    private static Node solution(Node head) {
        Node turtle = head;
        Node rabbit = head;

        while(rabbit!=null && rabbit.next!=null){
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            if(turtle==rabbit) break;
        }
        if(rabbit==null || rabbit.next==null)
            return null;

        turtle = head;

        while(turtle!=rabbit){
            turtle=turtle.next;
            rabbit=rabbit.next;
        }
        return rabbit;
    }
}
