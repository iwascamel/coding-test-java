package programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NotFinishedPlayer {
    public static void main(String[] args) {
        String[] participant = {"leo","kiki","eden"};
        String[] completion = {"eden","kiki"};

        String[] data2 = {"mislav","stanko","mislav","ana"};
        String[] data3 = {"stanko","ana","mislav"};

        String solution = solution(participant, completion);
        System.out.println(solution);
    }

    /*
    두 개의 해쉬를 만들어서
    두 개의 해쉬 값들이 같은 지 비교
    같지 않은 key 가 답
     */
    private static String solution(String[] participant, String[] completion) {

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        String result = null;

        for (String s : participant) {
            if(map.get(s)==null){
                map.put(s,0);
            }
            if(map.get(s)==0){
                map.put(s,1);
            }else{
                Integer integer = map.get(s);
                map.put(s,++integer);
            }
        }

        for (String s : completion) {
            if(map2.get(s)==null){
                map2.put(s,0);
            }
            if(map2.get(s)==0){
                map2.put(s,1);
            }else{
                Integer integer = map2.get(s);
                map2.put(s,++integer);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();

            Integer integer = map2.get(key);
            if(!value.equals(integer)){
                result=key;
            }
        }

        return result;
    }
}
