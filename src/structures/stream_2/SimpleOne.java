package structures.stream_2;

import java.util.Arrays;
import java.util.List;

public class SimpleOne {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("abcd","ab","aaaa","acadas");
        int count =0;
        for (String name : names){
            if(name.contains("a")){
                count++;
            }
        }
        System.out.println(count);
    }
}
