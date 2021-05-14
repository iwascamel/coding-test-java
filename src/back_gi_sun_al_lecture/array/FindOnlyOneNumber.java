package back_gi_sun_al_lecture.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 첫번째 예제. 오직 하나만 등장하는 숫자를 찾기
public class FindOnlyOneNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,4,2,5};
        System.out.println(usingList(arr));
        System.out.println(usingHashmap(arr));
        System.out.println(usingXOR(arr));
        usingXOR(arr);
    }


    // strategy 1
    // list 사용
    // 시간복잡도 O(n2)
    // 공간복잡도 O(n)
    public static int usingList(int[] numbers){
        List<Integer> list = new ArrayList<>();

        for(int number : numbers){
            if (list.contains(number)) {
                list.remove((Integer)number);
            }else{
                list.add(number);
            }
        }
        return list.get(0);
    }

    // strategy 2
    // 공간, 시간 O(n)
    // 공간이 n 인 이유는 hashmap 의 사이즈가 배열의 크기만큼 늘어날 수 있기 때문에
    public static int usingHashmap(int[] numbers){
        HashMap<Integer,Integer> map = new HashMap<>();

        // map.getOrDefault = 없다면 기본값 반환, 있다면 있는 값
        for(int num : numbers){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num:numbers){
            if (map.get(num)==1){
                return num;
            }
        }
        return -1;
    }

    // strategy 3
    // XOR 비트 연산자 사용
    // XOR 은 자기 자신을 만나면 0을 반환
    // XOR = 서로 다를 때 1
    // XOR 은 순서 상관 X
    // 0 XOR 나 = 나
    // 나 XOR 나 = 나
    // 시간 O(n)
    // 공간 O(1)
    public static int usingXOR(int[] numbers){
        int result =0;
        for (int num:numbers){
            result ^= num;
        }
        return result;
    }

}
