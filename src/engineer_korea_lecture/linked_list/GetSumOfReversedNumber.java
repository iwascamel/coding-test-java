package engineer_korea_lecture.linked_list;

public class GetSumOfReversedNumber {
    public static void main(String[] args) {
        Node n1 = new Node(9);
        n1.append(1);
        n1.append(4);

        Node n2 = new Node(6);
        n2.append(4);
        n2.append(3);

        Node solution = solution(n1.get(1), n2.get(1), 0);

        while(solution.next!=null){
            System.out.println(solution.val);
            solution=solution.next;
        }
        System.out.println(solution.val);
    }

    private static Node solution(Node n1, Node n2,int carry) {
        if(n1==null && n2==null && carry==0 ) return null;

        Node result = new Node();
        int value = carry;

        if(n1!=null){
            value +=n1.val;
        }
        if (n2 != null) {
            value += n2.val;
        }
        result.val = value%10;

        if(n1!=null || n2!=null){
            Node next = solution(n1==null ? null : n1.next,
                                n2==null ? null : n2.next,
                                value>=10?1:0);
            result.next=next;
        }
        return result;
    }
}
