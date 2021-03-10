package inflearn_lecture.string_array;

/*
문자열이 주어질 때, 두개의 가장 긴 연속적인 문자열의 길이를 구하라
ex)
aaaaaaabbbccddddeee
aaaaaaabbb 가 가장 길다.
 */

import java.util.HashMap;
import java.util.Map;

// 일단 패스
public class LongestSubMostTwoDistinct {
    public static void main(String[] args) {
        LongestSubMostTwoDistinct a = new LongestSubMostTwoDistinct();
        String input = "aaaaaaaccccccccccbbbbbbbbbcccddddddddddddddddddddd";

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<input.length();i++){
            Character c = input.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
    public String solution(String s){
    return null;
    }
}
