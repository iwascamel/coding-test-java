package inflearn_lecture.structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s,"+",true);

        List<String> list = new ArrayList<>();

        for(int i=0;i<st.countTokens();i++){
            list.add(st.nextToken());
        }
        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
