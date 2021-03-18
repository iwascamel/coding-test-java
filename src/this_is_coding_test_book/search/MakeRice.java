package this_is_coding_test_book.search;

/*
21-03-18
떡볶이 만들기
201page
 */

import java.util.Arrays;

public class MakeRice {
    public static void main(String[] args) {
        int X = 6;
        int[] array = {19, 15, 10, 17};
        Arrays.sort(array);
        int solution = solution(array, X);
        System.out.println(solution);
    }

    private static int solution(int[] array, int x) {
        int l = array.length;

        int number = array[l - 1] - x;
        int count = 0;

        while (count != x) {
            count = 0;
            for (int i = l - 1; i > 0; i--) {
                if (array[i] >= number) {
                    count += array[i] - number;
                }
            }
            if(count==x){
                break;
            }else{
                number++;
            }
        }
        return number;
    }
}
