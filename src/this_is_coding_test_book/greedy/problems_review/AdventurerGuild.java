package this_is_coding_test_book.greedy.problems_review;

import java.util.Arrays;

public class AdventurerGuild {
    public static void main(String[] args) {
        int[] n = {2,3,1,2,2};
        int[] arr = {2,3,1,2,2,5,3,2,2,1,1,2,3,3,2};

        Arrays.sort(arr);

        int solution = maximum(arr);
        System.out.println(solution);
    }

    private static int minimum(int[] n) {
        int i = n.length-1;
        int count=0;

        while(i>0){
            i -= n[i];
            count++;
        }
        return count;
    }
    private static int maximum(int[] n){
        int i=0;
        int count=0;

        while(i<n.length){
            i += n[i];
            count++;
        }
        return count;
    }
}
