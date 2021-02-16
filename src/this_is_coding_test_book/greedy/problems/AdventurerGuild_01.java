package this_is_coding_test_book.greedy.problems;
/*
📌 311 page

01. 모험가 길드
문제 이해가 안됨

 */

import java.util.Arrays;

public class AdventurerGuild_01 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,2,5,3,2,2,1,1,2,3,3,2};

        int solution = solution(arr);
        System.out.println(solution);
    }

    private static int solution(int[] arr) {
        Arrays.sort(arr);
        int pointer = 0;
        int count=0;
        while(pointer< arr.length){
            pointer += arr[pointer];
            count++;
        }
        return count-1;
    }
}
