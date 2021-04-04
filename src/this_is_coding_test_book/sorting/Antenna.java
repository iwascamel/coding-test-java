package this_is_coding_test_book.sorting;

import java.util.*;

public class Antenna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[] min = new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                min[i] += Math.abs(arr[i]-arr[j]);
            }
        }
        int minimum = 9999999;

        for(int i=0;i<N;i++){
            minimum = Math.min(minimum,min[i]);
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            if(min[i]==minimum) list.add(i);
        }

        Collections.sort(list);

        System.out.println(arr[list.get(0)]);
    }
}
