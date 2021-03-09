package coding_test_collections.soma_210227.test;

/*
토지개발
절반씩 쪼개서 왼쪽 최대 / 오른쪽 최대
마지막은 제외
이진탐색 / 재귀문제
 */

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        int[] data = new int[N];

        for(int i=0;i<N;i++){
            data[i]=sc.nextInt();
        }
        int solution = solution(data);
        System.out.println(solution);
    }

    private static int solution(int[] data) {
        int start=0;
        int end=data.length-1;
        int result=0;

        while(start<=end){
            if(start==end) break;
            int half = (start+end)/2;
            int left = max(start, half, data);
            int right = max(half+1,end,data);

            if(left>right){
                start=half+1;
                result += left;
            }else{
                end=half-1;
                result += right;
            }
        }
        return result;
    }

    private static int max(int start, int end, int[] data) {
        int max=0;
        for(int i=start;i<=end;i++){
            max = Math.max(max,data[i]);
        }
        return max;
    }
}
