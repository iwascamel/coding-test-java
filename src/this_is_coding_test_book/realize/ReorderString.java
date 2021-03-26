package this_is_coding_test_book.realize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReorderString {
    public static void main(String[] args) {
        String s = "K1KA57CB7";

        solution(s);
    }

    private static void solution(String s) {
        int l = s.length();

        int[] tempInt = new int[l];
        List<Character> characterList = new ArrayList<>();

        for(int i=0;i<l;i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                tempInt[i] = s.charAt(i)-'0';
            }else{
                characterList.add(s.charAt(i));
            }
        }

        Character[] tempC = new Character[characterList.size()];

        for(int i=0;i<characterList.size();i++){
            tempC[i]=characterList.get(i);
        }

        Comparator<Character> comp = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                    return o1.compareTo(o2);
            }
        };

        Arrays.sort(tempC,comp);

        StringBuilder result = new StringBuilder();

        for (Character character : tempC) {
            result.append(character);
        }

        int count=0;

        for(int k : tempInt){
            count += k;
        }

        result.append(count);

        System.out.println(result);
    }
}
