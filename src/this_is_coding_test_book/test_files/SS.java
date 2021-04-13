package this_is_coding_test_book.test_files;

import java.util.Arrays;
import java.util.Comparator;

public class SS {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        Integer[] aa = new Integer[3];

        aa[0]=1;
        aa[1]=2;
        aa[2]=3;

        Arrays.sort(aa,comp);

        for (Integer integer : aa) {
            System.out.println(integer);
        }
    }
}
