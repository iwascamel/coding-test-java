package Programmers.dp;

public class TriangleInteger {
    public static void main(String[] args) {
        int[][] data= {
                {7},
                {3,8},
                {8,1,0},
                {2,7,4,4},
                {4,5,2,6,5}
        };

        solution(data);
    }

    static class ListNode{
        int val;
        ListNode left;
        ListNode right;

        ListNode(int val){
            this.val=val;
        }
    }


    /*
    쭉 돌면서 ln left, right 등록
    등록 후 모든 left right 에 대해서 Math.max 를 따진다.
     */
    private static int solution(int[][] data) {

        ListNode ln = new ListNode(data[0][0]);

        for(int i=1;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                for(int k=0;k<data[i].length-1;k++){
                    ln.left = new ListNode(data[i][j+k]);
                    ln.right = new ListNode(data[i][j+k+1]);
                }
            }
        }

        return 0;
    }
}
