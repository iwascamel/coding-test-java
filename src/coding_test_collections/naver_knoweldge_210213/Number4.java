package coding_test_collections.naver_knoweldge_210213;

/*
문제 이해가 정확히 안됐다.
전의 값이 감소하고, 다음 값이 증가하면 block 이 바뀐다.
이 때 block 의 갯수를 구하라

ex)

421 56 97

124 56 79

3개의 블록 존재
 */

public class Number4 {
    public static void main(String[] args) {

        int[] data = {2,4,1,6,5,9,7};

        int solution = solution(data);
        System.out.println(solution);
    }

    /*
    감소했다가 증가하면 멈춘다
     */
    private static int solution(int[] A) {
        int count=0;
        for(int i=1;i<A.length-1;i++){
            if(A[i-1]>A[i] && A[i]<A[i+1]){
               count++;
            }
        }
        if(count==1) return 1;
        return count+1;
    }
}
