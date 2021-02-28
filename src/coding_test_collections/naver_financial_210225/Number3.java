package coding_test_collections.naver_financial_210225;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
만약 배열 안에 opposite number 가 존재한다면, opposite number 의 최대값을 구하라
 */

public class Number3 {
    public static void main(String[] args) {

        int[] A = {3,2,-2,5,-3};

        int solution = solution(A);
        System.out.println(solution);
    }

    private static int solution(int[] A) {
        int length = A.length;
        if(length==0) return 0;

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        Queue<Integer> queue = new PriorityQueue<>(comp);

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(A[i]==-A[j]){
                    queue.add(A[i]);
                }
            }
        }
        if(queue.isEmpty()){
            return 0;
        }else{
            return queue.peek();
        }
    }
}
