package this_is_coding_test_book.dp;

public class MakeOne {
    public static void main(String[] args) {
        int N = 26;

        int solution = solution(N);
        System.out.println(solution);
    }

    private static int solution(int n) {
        int[] dp = new int[999];

        int[] dirs = {2,3,5};

        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+1;

            for(int dir:dirs){
                if(dp[i]%dir==0){
                    dp[i] = Math.min(dp[i],dp[i/dir]+1);
                }
            }
        }
        return dp[n];
    }
}
