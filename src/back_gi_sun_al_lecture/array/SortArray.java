package back_gi_sun_al_lecture.array;

import java.util.Arrays;

// 정렬할 때 o(n)으로 정렬해보라
// 단 크기가 정해져있다 100 으로
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3,99,10};

        System.out.println(Arrays.toString(usingMarked(arr)));
    }

    public static int[] usingMarked(int[] arr){
        boolean[] marked = new boolean[100];

        for (int i : arr) {
            marked[i]=true;
        }

        int index= 0;
        for (int i=0;i<marked.length;i++){
            if (marked[i]){
                arr[index++] = i;
            }
        }
        return arr;
    }
}
