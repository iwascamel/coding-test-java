package ssafy.hw_210720;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DigitTest1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number == 0) break;
            if (number >= 10) {
                int tenNumber = number / 10;
                map.put(tenNumber, map.getOrDefault(tenNumber, 0) + 1);
            } else{
                map.put(0,map.getOrDefault(0,0)+1);
            }
        }

        Set<Integer> keys = map.keySet();
        for (int i : keys) {
            System.out.println(i + " : " + map.get(i) + "개");
        }
    }
}
