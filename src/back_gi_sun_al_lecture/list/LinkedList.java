package back_gi_sun_al_lecture.list;

import java.util.HashMap;
import java.util.Map;

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

}

