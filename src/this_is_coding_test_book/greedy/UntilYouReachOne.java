package this_is_coding_test_book.greedy;

/*
📌 Chapter03 . 그리디 99page

어떠한 수 N이 1이 될때까지 다음 두 과정을 반복
1. N-1
2. N/K

단, 2번은 N이 K로 나누어 떨어질때만 가능

총 수행한 횟수?
 */

public class UntilYouReachOne {
    public static void main(String[] args) {
        int N= 25;
        int K = 5;

        int solution = solution(N, K);
        System.out.println(solution);
    }

    private static int solution(int N, int K) {

        int count=0;

        while(N!=0){
            if(N%K!=0){
                N += -1;
                count++;
            }else if(N%K==0){
                N = 1;
                count++;
            }
        }
        return count;
    }
}
