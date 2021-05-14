package back_gi_sun_al_lecture.array;

import java.util.Collection;
import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int[] arr2= {1,2,3,4,5};

        System.out.println(usingHashMap(arr2));
    }

    /*
    1번
    이중 for loop 돌기
    time : o(n2)
    space : o(1)

    2번
    정렬 후 앞뒤 일치 확인
    time : o(n log n )
    space : o(log n)

    3번
    set 사용
     */

    public static boolean usingHashMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean flag = true;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Collection<Integer> map_values = map.values();
        for(int num:map_values){
            if (num >= 2) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
