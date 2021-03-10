package inflearn_lecture.string_array;

/*
anagram = 값은 같은데 순서만 다른 문자열
anagram 의 첫번째 인덱스를 반환하라

문자열을 256개의 int 로 선언해서 그 값을 저장한다. 그런 다음 동일 한 값을 갖고 있는지 비교하는게 포인트.
AnagramTest.java 참조
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram {
    public static void main(String[] args) {
        FindAllAnagram a= new FindAllAnagram();
        String txt = "BACDGABCDABDDDDDABCD";
        String pat = "ABCD";
        System.out.println(a.solution(txt,pat));
    }

    private List<Integer> solution(String txt, String pat) {
        List<Integer> result = new ArrayList<>();

        // 대조할 값을 integer 로 바꾸어서 담음
        int[] patArr = new int[256];
        for(int i=0;i<pat.length();i++){
            patArr[pat.charAt(i)]++;
        }

        // 0~3, 1~4 ... 값들을 담으면서 값을 비교함.
        for(int i=0;i<txt.length()-pat.length()+1;i++){
            int[] txtArr = new int[256];
            for(int j=0;j<pat.length();j++){
                txtArr[txt.charAt(i+j)]++;

                if(Arrays.equals(patArr,txtArr)){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
