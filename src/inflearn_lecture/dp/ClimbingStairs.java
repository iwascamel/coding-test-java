package inflearn_lecture.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3번째 계단 = 2번째 계단 + 1번째 계단

ex) 3번째 계단
3
21
12
111
그래서 output : 3

피보나치 메커니즘
 */

public class ClimbingStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int solution = solution(n);
        System.out.println(solution);
    }

    private static int solution(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        if(n==1) return 1;
        if(n==2) return 2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
