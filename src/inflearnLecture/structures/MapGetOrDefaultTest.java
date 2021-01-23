package inflearnLecture.structures;

import java.util.HashMap;

public class MapGetOrDefaultTest {
    public static void main(String[] args) {
        String [] alphabet = { "A", "B", "C" ,"A","A"};
        HashMap<String, Integer> map = new HashMap<>();

        for(String key : alphabet){
            map.put(key, map.getOrDefault(key, 0)+1);
            System.out.println(map);
        }
        Integer a = map.getOrDefault("A", 0);
//        System.out.println(a);
        // 왜 {A:1,B:1,C:1,A:1,A:1} 이런식으로 출력 안되는지 의문이었는데, Hashmap 이라서 key 의 중복을 허용하지 않음.
        // MapTest.java 의 코드를 보면 이해됨
        // 왜 map.getOrDefault(key,0)+1 이냐. 전에 있던 거를 불러오는 것 = getOrDefault. 전에 거를 불러오고 그 다음에 +1

        System.out.println("결과 : " + map);

    }
}
