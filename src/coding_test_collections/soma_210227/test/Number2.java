package coding_test_collections.soma_210227.test;

/*
소마 피시방
pc 사람수 limit
2 7 4
1 10
1 5
1 7
2 10
2 1
2 3
2 7

최대 이익?

시간당 1000원

 */

import java.util.Arrays;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int PC = sc.nextInt();
        int people = sc.nextInt();
        int limit = sc.nextInt();

        int[] max = new int[PC];

        Arrays.fill(max,limit);

        for(int i=0;i<people;i++){
            int pcNumber = sc.nextInt();
            int pcHour = sc.nextInt();

            max[pcNumber-1] = solution(pcHour,max[pcNumber-1],limit);
        }
        for(int i=0;i<max.length;i++){
            max[i] = (limit*1000-(max[i]*1000));
        }
        for (int i : max) {
            System.out.println(i);
        }
    }

    private static int solution(int pcHour, int max,int limit) {
        if(pcHour>limit){
            return max;
        }else{
            return max-pcHour;
        }
    }
}
