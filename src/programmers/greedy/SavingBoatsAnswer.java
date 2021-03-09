package programmers.greedy;

import java.util.Arrays;

public class SavingBoatsAnswer {
    public static void main(String[] args) {
        int [] people = {50,70,50,80};
        int limit = 100;

        int solution = solution(people, limit);
        System.out.println(solution);
    }

    private static int solution(int[] people, int limit) {

        Arrays.sort(people);

        int min=0;
        int result=0;

        for(int max=people.length-1;max>=min;max--){
            if(people[max]+people[min]<=limit) {
                min++;
            }
            result++;
        }
        return result;
    }
}
