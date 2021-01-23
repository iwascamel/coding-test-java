package inflearnLecture.string_array;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
배열안에서 2번째로 큰 수는?
array sorting 후 풀면 되는데, priorityQueue 사용해서 풀어보자.
 */

public class KthLargestElementInAnArray {
    public static void main(String[] args) {

        Comparator<Integer> comp = (o1, o2) -> o1-o2;

        int[] arrays = {4,2,1,5,7,10,232};

        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);

        for (Integer i :arrays) {
            pq.offer(i);
            if(pq.size()>=3){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
