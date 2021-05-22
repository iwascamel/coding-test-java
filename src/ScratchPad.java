import java.util.HashMap;
import java.util.Map;

public class ScratchPad {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(2,2);

        System.out.println(map.getOrDefault(2,4));
        System.out.println(map.getOrDefault(3,4));

        System.out.println(map);
    }
}

