package inflearnLecture.string_array;

import java.util.HashSet;
import java.util.Set;

/*
문자열의 중복을 막기 위해 set 에 담는다.
set 에
 */

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewls = "aAaaaaaaAczxzxcasasdaqwdwq";
        String S = "aAsdadaA";
        int count=0;

        Set<Character> set = new HashSet<>();

        for(char j : jewls.toCharArray()){
            set.add(j);
        }
        for (Character character : S.toCharArray()) {
            if(set.contains(character)){
                count++;
            }
        }

        System.out.println(count);
    }
}
