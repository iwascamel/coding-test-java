package structures;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ABCDE";

        solution1(s);
        solution2(s);
    }

    private static void solution1(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String a = new StringBuilder(new String(c)).reverse().toString();

        System.out.println(a);
    }


    // character comparator 이용
    private static void solution2(String s) {
        Comparator<Character> comp = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        };
        Character[] c = new Character[s.length()];

        for(int i=0;i<s.length();i++){
            c[i] = s.charAt(i);
        }

        Arrays.sort(c,comp);

        for (Character a : c) {
            System.out.println(a);
        }
    }
}
