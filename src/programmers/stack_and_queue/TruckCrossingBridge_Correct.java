package programmers.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

public class TruckCrossingBridge_Correct {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        Integer solution = solution(bridge_length, weight, truck_weights);
        System.out.println(solution);
    }

    private static Integer solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();

        int max = weight;
        int count=0;


        for(int T : truck_weights){
            while(true){
                if(queue.isEmpty()){
                    queue.offer(T);
                    max -= T;
                    count++;
                    break;
                }else if(queue.size()==bridge_length) {
                    max += queue.poll();
                } else {
                    if(max>=T){
                        queue.offer(T);
                        max -= T;
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
