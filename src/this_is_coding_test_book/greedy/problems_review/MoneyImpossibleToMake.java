package this_is_coding_test_book.greedy.problems_review;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoneyImpossibleToMake {
    public static void main(String[] args) {
        int[] arr = {3,2,1,1,9};

        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            list.add(i);
        }

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        list.sort(comp);

        int target=1;

        for(int i=0;i<arr.length;i++){
            if(target<list.get(i)){
                break;
            }
            target += list.get(i);
        }
        System.out.println(target);
    }
}
