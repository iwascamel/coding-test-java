package programmers.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SavingBoats {
    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int[] people2 = {70,80,50};

        int limit = 100;

        int solution = solution(people2, limit);
        System.out.println(solution);
    }

    private static int solution(int[] people, int limit) {
        Queue<Integer> queue = new LinkedList<>();
        int count=1;
        Arrays.sort(people);

        queue.add(limit);

        for(int i=0;i< people.length;i++){
            if(people[i]<=queue.peek()){
                Integer poll = queue.poll();
                poll = poll-people[i];
                queue.offer(poll);
            }else{
                queue.poll();
                queue.offer(limit);
                count++;
            }
        }
        return count;
    }
}
