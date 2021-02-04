package inflearnLecture.dp;

/*
전의 값보다 값이 크면 +1
증가한 구간의 총 길이?

ex)
Q)   1 2 3 2 5 2 6 10 4 12
dp)  1 2 3 2 4 2 5 6 4 7

답 7
 */

import java.util.Arrays;

// 해볼 것
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,5,2,6,10,4,12};
        solution(nums);
    }

    private static int solution(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        return 1;
    }
}
