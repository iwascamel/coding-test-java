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

        LongestIncreasingSubsequence a = new LongestIncreasingSubsequence();
        int[] nums = {1,2,3, 2, 5, 2, 6, 10, 4, 12};
//		int[] nums = {9,11,2,8,4,7,88,15};

        System.out.println("value "+ a.solve(nums));
    }
    public int solve(int[] nums) {
        if(nums == null || nums.length==0)
            return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int result = 1;
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            result=Math.max(result, dp[i]);
        }
        return result;

    }
}
