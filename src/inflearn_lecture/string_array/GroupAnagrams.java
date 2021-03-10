package inflearn_lecture.string_array;

/*
input : ["aet","tea","ate","nat","bat"]

output : [
    ["aet","ate","tea"],
    ["nat"],
    ["bat"]
]

같은 아나그램끼리 sorting 후 array 로 묶어서 반환하라
 */

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] list = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution(list));
    }

    private static List<List<String>> solution(String[] list) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String str : list) {
            // 일단 String sorting
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String key = String.valueOf(charArray);

            // sorting 을 했으므로, 같은 아나그램 이라면 같은 값으로 나올 것
            // 그래서 값이 있다면 List 에 추가, 값이 없다면 map 에 값 추가
            if(map.containsKey(key)){ // = map.get("value") == key
                map.get(key).add(str);
            }else{
                List<String> li = new ArrayList<>();
                li.add(str);
                map.put(key,li);
            }
        }
        result.addAll(map.values());
        return result;
    }
}
