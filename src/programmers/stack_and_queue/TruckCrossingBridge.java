package programmers.stack_and_queue;

import java.util.*;

public class TruckCrossingBridge {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        Integer solution = solution(bridge_length, weight, truck_weights);
        System.out.println(solution);
    }

    private static Integer solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Map<Integer,Integer>> Q = new LinkedList<>();
        Map<Integer,Integer> first = new HashMap<>();

        int time=1;
        first.put(truck_weights[0],time);
        Q.offer(first);

        int CW = weight-truck_weights[0];

        for(int i=1;i<truck_weights.length;i++){
            if(truck_weights[i]<=CW){
                CW -= truck_weights[i];

                Map<Integer,Integer> bus = new HashMap<>();
                bus.put(truck_weights[i],0);
                Q.offer(bus);

                while(!Q.isEmpty()){
                    Map<Integer, Integer> poll = Q.poll();
                    Integer truckWeight = getKey(poll);
                    Integer currentTime = poll.get(truckWeight);
                    if(currentTime==bridge_length){
                        time++;
                        CW = CW + truckWeight;
                    }else if(currentTime<bridge_length){
                        time++;
                        Map<Integer,Integer> plusTime = new HashMap<>();
                        plusTime.put(truckWeight,++currentTime);
                        Q.offer(plusTime);
                    }
                }
            }else{
                while(!Q.isEmpty()){
                    Map<Integer, Integer> poll = Q.poll();
                    Integer truckWeight = getKey(poll);
                    Integer currentTime = poll.get(truckWeight);
                    if(currentTime==bridge_length){
                        CW = CW + truckWeight;
                        time++;
                    }else if(currentTime<bridge_length){
                        Map<Integer,Integer> plusTime = new HashMap<>();
                        plusTime.put(truckWeight,++currentTime);
                        Q.offer(plusTime);
                        time++;
                    }
                }
            }
        }
        return time-1;
    }
    static Integer getKey(Map<Integer, Integer> poll) {
        int result=0;
        Iterator<Integer> iterator = poll.keySet().iterator();
        while(iterator.hasNext()) result = iterator.next();
        return result;
    }
}
