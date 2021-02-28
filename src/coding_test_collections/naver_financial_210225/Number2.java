package coding_test_collections.naver_financial_210225;

/*
A[i] = X 인 i 를 찾는 문제인데
코드가 주어졌음
최대 3줄 추가해서 수정하기

이진탐색 문제
 */

public class Number2 {
    public static void main(String[] args) {

        int[] A = {1, 2, 5, 9};
        int X = 5;

        int solution = solution(A, 5);
        System.out.println(solution);
    }

    private static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            }
            // 밑에 3줄 추가함
            if (A[m]==X) {
                l=m;
                break;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }
}
