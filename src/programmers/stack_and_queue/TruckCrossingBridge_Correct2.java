package programmers.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

/*
https://rooted.tistory.com/22
 */

public class TruckCrossingBridge_Correct2 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        Integer solution = solution(bridge_length, weight, truck_weights);
        System.out.println(solution);
    }
    private static Integer solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();

        int max = 0;
        int count=0;

        for(int T : truck_weights){
            while(true){
                if(queue.isEmpty()){
                    queue.offer(T);
                    max += T;
                    count++;
                    break;
                }else if(queue.size()==bridge_length) {
                    max -= queue.poll();
                } else {
                    if(max+T<weight){
                        queue.offer(T);
                        max += T;
                        count++;
                        break;
                    }else{
                        queue.offer(0);
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
