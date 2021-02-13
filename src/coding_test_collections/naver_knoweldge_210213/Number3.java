package coding_test_collections.naver_knoweldge_210213;

/*
두 마리의 개구리가 양쪽으로 갈 수 있다.
개구리는 값이 같거나 클 경우에만 움직일 수 있다.
갈 수 있는 값의 최대치?

ex)
     1 5 5 2 6
초기)      oo
이동)   o     o

2에 있다가 2번째 index, 마지막 index 로 이동하는 것이 최대값이다.
거리는 index2-index1+1
거리의 값 return 해라
 */

public class Number3 {
    public static void main(String[] args) {
        int[] data = {1,5,5,2,6};
        //             0  0  0 1  2  0  0 0 0

        int solution = solution(data);
        System.out.println(solution);
    }

    private static int solution(int[] data) {



        int[] result = new int[data.length];

        for(int i=0;i<data.length;i++){
            result[i] = dynamic(data)[i]+reverseDynamic(data)[i];
        }
        int max=0;

        for(int i=0;i<result.length;i++){
            max=Math.max(max,result[i]);
        }

        return max+1;
    }

    /*
    📌 오른쪽
    모든 Array 의 index 를 돌면서 양쪽의 거리를 체크한다
    이 때 전의 값보다 현재 값이 크면 전의 값에 저장했던 값에 -1 만 해준다.
    📌 왼쪽
    전의 값(index 가 큰 값)보다 현재 값이 크면
     */

    private static int[] dynamic(int[] data) {
        int [] dp = new int[data.length];
        int max=0;

        for(int i=0;i<data.length;i++){
            int count=0;

            for(int j=i+1;j<data.length;j++){
                if(i==0){
                    if(data[j-1]<=data[j]){
                        count++;
                    }else{
                        break;
                    }
                    dp[i]=count;
                }else{
                    if(data[i-1]<=data[i] && dp[i-1]!=0){
                        dp[i]=dp[i-1]-1;
                    }else{
                        if(data[j-1]<=data[j]){
                            count++;
                        }else{
                            break;
                        }
                        dp[i]=count;
                    }
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            max=Math.max(max,dp[i]);
        }
        return dp;
    }

    private static int[] reverseDynamic(int[] data) {
        int [] dp = new int[data.length];
        int max=0;

        for(int i= data.length-1;i>0;i--){
            int count=0;

            for(int j=i;j>1;j--){
                if(i==data.length){
                    if(data[j-1]>=data[j]){
                        count++;
                    }else{
                        break;
                    }
                    dp[i]=count;
                }else{
                    if(data[i-1]>=data[i] && dp[i-1]!=0){
                        dp[i]=dp[i-1]-1;
                    }else{
                        if(data[j-1]>=data[j]){
                            count++;
                        }else{
                            break;
                        }
                        dp[i]=count;
                    }
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            max=Math.max(max,dp[i]);
        }

        return dp;
    }
}
