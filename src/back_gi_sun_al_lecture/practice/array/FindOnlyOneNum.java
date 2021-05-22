package back_gi_sun_al_lecture.practice.array;

import java.util.*;

public class FindOnlyOneNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,4};

        System.out.println(usingList(arr));
        System.out.println(usingHash(arr));
        System.out.println(usingXOR(arr));
    }

    static int usingList(int[] arr){
        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(list.contains(num)){
                list.remove((Integer) num);
            }else {
                list.add(num);
            }
        }
        return list.get(0);
    }
    static int usingHash(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> keys = map.keySet();
        for(int num:keys){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
    static int usingXOR(int[] arr){
        int temp = 0;
        for(int num:arr){
            temp ^= num;
        }
        return temp;
    }
}
