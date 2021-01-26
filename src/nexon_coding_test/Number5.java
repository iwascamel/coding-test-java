package nexon_coding_test;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
    }
}

public class Number5 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,3,2};
        int[] arr4 = {5,112,3,2,50};
        int solution = solution(arr);
        System.out.println(solution);
    }
    public static int solution(int[] arrays){

        ListNode listNode;
        ListNode prev;

        for (int array : arrays) {
            listNode = new ListNode(array);
            listNode=listNode.next;
        }
        for(int i= arrays.length;i>0;i--){

        }
        return 1;
    }
}
