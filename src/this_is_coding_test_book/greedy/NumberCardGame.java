package this_is_coding_test_book.greedy;

/*
📌 Chapter03 . 그리디 96page

행에서 가장 작은 값들을 추출
추출한 값들 중에 가장 큰 값?
 */

import java.util.Arrays;

public class NumberCardGame {
    public static void main(String[] args) {
        int[][] grid ={
                {3,1,2},
                {4,1,4},
                {2,2,2},
                {3,5,6}
        };
        int solution = solution(grid);
        System.out.println(solution);
    }

    private static int[] getEachRowMinNumbers(int[][] grid){
        int[] maxNumbers = new int[grid.length];

        Arrays.fill(maxNumbers, 9999);

        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                maxNumbers[i] = Math.min(maxNumbers[i],grid[i][j]);
            }
        }
        return maxNumbers;
    }

    private static int solution(int[][] grid) {
        int[] arr = getEachRowMinNumbers(grid);
        int max=0;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
