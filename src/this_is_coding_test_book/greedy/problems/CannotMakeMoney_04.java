package this_is_coding_test_book.greedy.problems;

import java.util.Arrays;

/*
만들 수 있는 숫자의 합에서
비어있는 숫자 중 최소 값 ?
 */

public class CannotMakeMoney_04 {
    public static void main(String[] args) {
        int[] data = {3,2,1,1,9};
        long startTime = System.currentTimeMillis();

        int i = solution1(data);
        System.out.println(i);

        long endTime = System.currentTimeMillis();

        long finalTime = startTime-endTime;
        System.out.println("finalTime = " + finalTime);
    }

    // 책의 풀이
    private static int solution1(int[] data) {
        int target=1;

        Arrays.sort(data);

        for (int x : data) {
            if(target<x) break ;
            target+=x;
        }
        return target;
    }

}
