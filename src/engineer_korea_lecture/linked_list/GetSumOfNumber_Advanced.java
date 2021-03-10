package engineer_korea_lecture.linked_list;

public class GetSumOfNumber_Advanced {
    public static void main(String[] args) {
        Node n1 = new Node(9);
        n1.append(1);

        Node n2 = new Node(1);
        n2.append(1);

        Node solution = solution(n1, n2);

        while(solution.next!=null){
            System.out.println(solution.val);
            solution=solution.next;
        }
        System.out.println(solution.val);

    }
    private static Node solution(Node n1, Node n2) {
        int length1 = getListLength(n1);
        int length2 = getListLength(n2);

        if(length1>length2){
            n2 = addZeroToHead(n2,length1-length2);
        }else{
            n1 = addZeroToHead(n1,length2-length1);
        }

        Storage storage = addLists(n1,n2);

        if(storage.carry==0){
            return storage.result;
        }else{
            storage.result = insertBefore(storage.result,storage.carry);
            return storage.result;
        }
    }

    private static Storage addLists(Node n1, Node n2) {
        if(n1==null && n2==null){
            Storage storage = new Storage();
            return storage;
        }
        Storage storage = addLists(n1.next,n2.next);

        int value = storage.carry + n1.val + n2.val;
        int data = value%10;

        storage.result = insertBefore(storage.result, data);
        storage.carry = value/10;
        return storage;
    }
    private static int getListLength(Node n){
        int total=1;
        while(n.next!=null){
            n=n.next;
            total++;
        }
        return total;
    }
    // 노드 앞에 새로운 노드를 추가
    private static Node insertBefore(Node node,int data){
        Node before = new Node(data);
        if(node!=null){
            before.next=node;
        }
        return before;
    }

    private static Node addZeroToHead(Node n,int length){
        Node head = n;
        for(int i=0;i<length;i++){
            head = insertBefore(head,0);
        }
        return head;
    }

    static class Storage{
        int carry=0;
        Node result=null;
    }
}
