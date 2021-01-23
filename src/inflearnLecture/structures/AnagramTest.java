package inflearnLecture.structures;

import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {

        String ab = "abcd";
        String ba = "badc";

        int[] check = new int[256];
        for(int i=0;i<ab.length();i++){
            check[ab.charAt(i)]++;
        }
        int[] baChecking = new int[256];
        for(int i=0;i<ab.length();i++){
            baChecking[ba.charAt(i)]++;
        }
        if(Arrays.equals(check, baChecking)){
            System.out.println("true");
        }
    }
}
