package sort_series;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_Other {
    public static void main(String[] args) {
        int[] arr = {3,2,1,10,15,2352,122};

        System.out.println(Arrays.toString(quick(arr)));
    }

    public static int[] quick(int[] arr){

        if(arr.length <=1) return arr;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        int pivot = arr[0];

        for(int i=1;i<arr.length;i++) {
            if (arr[i] < pivot) {
                left.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }

        int[] left_arr = new int[left.size()];

        for(int i=0;i<left.size();i++){
            left_arr[i]=left.get(i);
        }

        int[] right_arr = new int[right.size()];

        for(int i=0;i<left.size();i++){
            right_arr[i]=left.get(i);
        }

        int[] quick_left = quick(left_arr);
        int[] quick_right = quick(right_arr);

        ArrayList<Integer> result = new ArrayList<>();

        if(quick_left!=null){
            for (int i : quick_left) {
                result.add(i);
            }
        }

        result.add(pivot);

        if(quick_right!=null){
            for (int i : quick_right) {
                result.add(i);
            }
        }
        int[] result_arr = new int[result.size()];

        for(int i=0;i<result.size();i++){
            result_arr[i] = result.get(i);
        }

        return result_arr;
    }
}
