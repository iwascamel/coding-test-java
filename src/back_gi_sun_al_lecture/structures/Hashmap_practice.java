package back_gi_sun_al_lecture.structures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_practice {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        // 추가
        map.put("안녕",1);
        map.put("키키",2);
        map.put("코쿠",3);

        // 다른 hash 더하기
        Map<String,Integer> add = new HashMap<>();
        add.put("더했다",4);
        map.putAll(add);

        // 값 가져오기
        System.out.println(map.get("안녕"));

        // key 값 가져오기. Set<Generic> 으로 받는 것 기억
        Set<String> keys = map.keySet();
        for (String key :keys){
            System.out.println(key);
        }

        // 값들 가져오기. Collection<Generic> 으로 받는 것 기억
        Collection<Integer> values = map.values();

        for(Integer intValue : values){
            System.out.println(intValue);
        }

        // 값 가지고 있는지 확인
        System.out.println(map.containsKey("더했다"));
        System.out.println(map.containsValue(1213));

        //값 변경
        map.replace("안녕",4);
        System.out.println(map.get("안녕"));
    }
}
