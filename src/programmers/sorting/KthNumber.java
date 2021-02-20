package programmers.sorting;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};

        // 5 2 6 3
        // 2 3 5 6
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };

        solution(array,commands);
    }

    private static void solution(int[] array, int[][] commands) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        int[] s = new int[commands.length];

        PriorityQueue<Integer> pq = new PriorityQueue(comp);

        for(int i=0;i<commands.length;i++){
            int first = commands[i][0]-1;
            int end = commands[i][1]-1;
            int number = commands[i][2];
            for(int j=first;j<=end;j++){
                pq.offer(array[j]);
            }

            for(int k=0;k<number-1;k++){
                pq.poll();
            }
            for (Integer integer : pq) {
                System.out.println(integer);
            }
            System.out.println(" === ");

            s[i] = pq.peek();
            while(!pq.isEmpty()){
                pq.poll();
            }
        }
        for (int i : s) {
            System.out.println(i);
        }
    }
}
