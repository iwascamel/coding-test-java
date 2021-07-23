package ssafy.hw_210722;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int[] copyArr = Arrays.copyOfRange(arr,0,4);

        String s = Arrays.toString(copyArr);
        System.out.println(s);
    }
}
