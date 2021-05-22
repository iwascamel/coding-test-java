package back_gi_sun_al_lecture.practice.array;

/*
Array 가 중복된 값인지 확인
O(n)으로 풀 것
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContainsDup {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,2};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 ={1,2,3};

        ContainsDup c = new ContainsDup();
        boolean result = c.usingHashMap(arr);
        System.out.println(result);

    }
    boolean usingHashMap(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> keys = map.keySet();
        for(int num : keys){
            if (map.get(num) >1){
                return false;
            }
        }
        return true;
    }
}
