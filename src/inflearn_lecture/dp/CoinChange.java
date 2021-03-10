package inflearn_lecture.dp;

/*
input = coins : [1,2,5] amount = 11
output = 3

11 = 5 + 5 + 1

dp 문제라면, dp 문제인지 언능 알아야 한다.
dp 문제 = 내가 얻은 결과값은 앞에서 이미 정해진 값이다
bfs 랑 헷갈릴 수 있는데, bfs 는 단순 탐색이다
 */

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        int solution = solution(coins, amount);
        System.out.println(solution);
    }

    private static int solution(int[] coins, int amount) {
        int max = amount +1;
        int[] dp = new int[max];
        Arrays.fill(dp,max);
        dp[0]=0;

        for(int i=1;i<=amount;i++){
            for(int j=0;j< coins.length;j++){
                if(i-coins[j]>=0){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount];
    }
}
