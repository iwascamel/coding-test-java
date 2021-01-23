package inflearnLecture.structures;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();

        map.put("A",2);
        map.put("A",3);

        System.out.println(map);

        //

        Map<String,Integer> map2 = new HashMap();
        map2.put("B",3);
        System.out.println(map2.get("B"));
    }
}
