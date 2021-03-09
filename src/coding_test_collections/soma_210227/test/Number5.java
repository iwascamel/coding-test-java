package coding_test_collections.soma_210227.test;

/*
두더지게임

input :
N : 2 ( NXN)
score / 나오는횟수 / 나오는 시간
1 3 1 3 5
2 2 2 4
3 2 1 2
4 1 3

output : 13
최대값?
 */

import java.util.HashMap;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int N = number*number;
        int result=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            int score = sc.nextInt();
            int iterator = sc.nextInt();

            for(int j=0;j<iterator;j++){
                int time = sc.nextInt();
                map.put(time,score);
            }
        }
        for (Integer value : map.values()) {
            result += value;
        }
        System.out.println(result);
    }
}
