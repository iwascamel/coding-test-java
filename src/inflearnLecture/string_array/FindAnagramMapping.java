package inflearnLecture.string_array;

/*
배열 A와 값은 같지만 순서만 다른 B 배열이 있다.
A 배열의 값에 해당되는 B 배열의 index 를 반환하라.
 */

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping {
    public static void main(String[] args) {
        int[] a = {11,27,1,324,12};
        int[] b = {27,11,324,12,1};

        int[] result = solution(a,b);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] a, int[] b) {
        int [] result = new int[a.length];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            map.put(b[i],i);
        }
        for(int i=0;i<a.length;i++){
            result[i] = map.get(a[i]);
        }
        return result;
    }
}
