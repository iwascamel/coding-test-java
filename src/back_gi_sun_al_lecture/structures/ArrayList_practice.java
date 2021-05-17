package back_gi_sun_al_lecture.structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_practice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // 객체 타입으로 넘기면 값 삭제해줌
        list.remove((Integer) 30);

        // enhance for 문 사용하지 않고 사용하는 방법. iterator 사용
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        int index = list.indexOf((Integer) 40);
        list.add(index,1010);

        System.out.println("===");

        for(int i:list){
            System.out.println(i);
        }

    }
}
