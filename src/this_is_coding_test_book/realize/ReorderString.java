package this_is_coding_test_book.realize;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderString {
    public static void main(String[] args) {
        String s = "K1KA57CB7";

        solution(s);
    }

    private static void solution(String s) {
        int l = s.length();

        StringBuilder sb = new StringBuilder();
        StringBuilder sbNumber = new StringBuilder();

        for(int i=0;i<l;i++){
            if(s.charAt(i)<48 || s.charAt(i)>57){
                sb.append(s.charAt(i));
            }else{
                sbNumber.append(s.charAt(i));
            }
        }
        String s1 = sb.toString();
        String s2 = sbNumber.toString();

        Character[] c = new Character[s1.length()];

        Comparator<Character> comp = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        };

        for(int i=0;i<s1.length();i++){
            c[i]=s.charAt(i);
        }

        Arrays.sort(c,comp);

        String result1= "";

        for(Character a : c){
            result1 += a;
        }

        int[] result2 = new int[s2.length()];

        for(int i=0;i<s2.length();i++){
            result2[i]=s2.charAt(i)-'0';
        }
        int result3 = 0;

        for(int ll : result2){
            result3 += ll;
        }

        result1 += result3;

    }
}
