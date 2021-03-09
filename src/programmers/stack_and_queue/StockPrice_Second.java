package programmers.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

/*
21-03-08
가격이 떨어지지 않는, index 가 후차적인 모든 값을 찾는 것으로 잘못 찾음
문제상으로는 가격이 떨어졌으면 멈춰야 하는데

효율성 테스트는 통과하지 못한다
 */

public class StockPrice_Second {
    public static void main(String[] args) {
        int[] prices = {4,5,8,2,3,2,1,4};
        int[] prices2 = {1,2,3,2,3};

        int[] solution = solution(prices);

        for (int price : solution) {
            System.out.println(price);
        }
    }

    private static int[] solution(int[] prices) {

        int L = prices.length;

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tempQueue = new LinkedList<>();

        for (int price : prices) {
            queue.offer(price);
        }

        int[] result = new int[L];

        for(int i=0;i < L;i++){
            int present = queue.poll();
            int count=0;

            while(!queue.isEmpty()){
                int temp = queue.poll();
                tempQueue.offer(temp);
                count++;
                if(present>temp) {
                    break;
                }
            }
            while(!queue.isEmpty()){
                tempQueue.add(queue.poll());
            }
            while(!tempQueue.isEmpty()){
                queue.add(tempQueue.poll());
            }
            result[i]=count;
        }
        return result;
    }
}
