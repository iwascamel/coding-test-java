package back_gi_sun_al_lecture.structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_practice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.remove(4);

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
