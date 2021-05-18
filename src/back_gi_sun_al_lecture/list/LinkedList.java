package back_gi_sun_al_lecture.list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedList {

    private Node head;
    private Node tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(5));
        list.add(new Node(6));
        list.add(new Node(7));
        list.add(new Node(8));


//        list.print();
//        list.reverse();
//        list.print();
//        list.reverse();
//        list.print();

        System.out.println(list.getNthNumber_using_hashmap(5));
        System.out.println(list.getNthNumber_using_index(5));
        System.out.println(list.getNthNumber_using_twoPointer(5));

        LinkedList list2 = new LinkedList();
        list2.add(new Node(1));
        list2.add(new Node(1));
        list2.add(new Node(2));
        list2.add(new Node(2));
        list2.add(new Node(3));

        list2.removeDuplicates_using_set();
        list2.print();

    }
    void print(){
        Node node = this.head;
        while(node !=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    void add(Node node){
        if(head==null){
            head=node;
            tail=node;
        }else if(tail!=null){
            tail.next =node;
            tail=tail.next;
        }
    }

    // 순차적인 방법
    void reverse(){
        Node current = this.head;
        Node prev = null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        this.tail=this.head;
        // current 는 현재 null
        this.head=prev;
    }

    void reverse_using_recursive(){
        Node head = this.head;
        this.head = reverse_recursive(head);
        this.tail = head;
    }

    Node reverse_recursive(Node node){
        if (node == null || node.next==null){
            return node;
        }

        Node newHead = reverse_recursive(node.next);
        node.next.next = node;
        node.next =null;
        return newHead;
    }

    // 끝에서 n 번째의 노드값은?
    // 시간 o(n), 공간 o(n) => hashmap 을 사용했기 때문(hashtable 은 기능은 map 과 동일하나 synchronized 적용돼있음 )
    int getNthNumber_using_hashmap(int n){
        Map<Integer,Node> map = new HashMap<>();
        Node node = head;
        int index= 0;
        while (node!=null){
            map.put(index++,node);
            node=node.next;
        }
        return map.get(map.size()-n).val;
    }

    // 단순 index 만 사용하면 시간복잡도는 O(n) 이지만, 공간복잡도가 O(1)임
    int getNthNumber_using_index(int n){
        int totalSize = 0;
        Node node = head;
        while (node!=null){
            node=node.next;
            totalSize++;
        }
        int targetIndex = totalSize-n;

        Node targetNode = head;
        while (targetIndex>0){
            targetIndex--;
            targetNode=targetNode.next;
        }
        return targetNode.val;
    }

    int getNthNumber_using_twoPointer(int n){
        int count=0;
        Node left = head;
        Node right = head;
        while (right.next!=null){
            if(count == n-1){
                left=left.next;
                right=right.next;
            }else if(count<n){
                right=right.next;
                count++;
            }
        }
        return left.val;
    }

    // 투 포인터 이용 -> 수리해주고 다음 것, 수리해주고 다음 것 이동하는 느낌임
    // 같지 않을때까지 이동하고, 그 노드값을 현재 값에 넣어줌
    void removeDuplicates_using_index(){
        Node current = head;
        while (current!=null){
            Node next = current;
            while (next!=null && next.val == current.val){
                next=next.next;
            }
            current.next = next;
            current= current.next;
        }
    }

    void removeDuplicates_using_recursive(){
        removeDuplicates_recursive(this.head);
    }

    // 현재와 다음것이 같으면, 다음것으로 넘어감. 재귀호출
    // 같지 않다면 다음것 넘겨줌
    Node removeDuplicates_recursive(Node node){
        if (node==null){
            return null;
        }

        if(node.next!=null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                removeDuplicates_recursive(node);
            }else{
                removeDuplicates_recursive(node.next);
            }
        }
        return node;
    }

    // set 과 two pointer 이용
    // 있다면 넘어가고, 없으면 넣어줌. prev 전진
    void removeDuplicates_using_set(){
        Set<Integer> set = new HashSet<>();
        Node prev = null;
        Node current = head;

        while(current !=null){
            if(set.contains(current.val)){
                prev.next = current.next;
            }else{
                set.add(current.val);
                prev = current;
            }
            current=current.next;
        }
    }

    boolean findCircular_using_set(){
        Node current = head;
        Set<Node> set = new HashSet<>();
        while(current!=null){
            if(set.contains(current)){
                return true;
            }else{
                set.add(current);
                current= current.next;
            }
        }
        return false;
    }

    // 시간복잡도 O(n), 공간 O(1)
    // slow, fast 투 포인터 이용
    // 순환 구조가 있다면 결국엔 만난다.
    boolean findCircular_using_twoPointer(){
        Node fast = head;
        Node slow = head;

        while(slow!=null && fast!=null){
            if(fast.next==null || fast.next.next==null){
                return false;
            }
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
            slow=slow.next;
        }
        return true;
    }

}

