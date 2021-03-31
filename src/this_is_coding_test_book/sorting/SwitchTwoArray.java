package this_is_coding_test_book.sorting;

import java.util.Arrays;
import java.util.Collections;

public class SwitchTwoArray {
    public static void main(String[] args) {
        int[] a = {1,2,5,4,3};
        int[] b = {5,5,6,6,5};
        Integer[] b1 = {5,5,6,6,5};
        Arrays.sort(a);

        int k=3;

        Integer[] b2 = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(b2, Collections.reverseOrder());

        int i=0;

        while(i<k){
            if(a[i]<b2[i]){
                a[i]=b2[i];
                i++;
            }else{
                break;
            }
        }
        for (int i1 : a) {
            System.out.println(i1);
        }
    }
}
