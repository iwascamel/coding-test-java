package this_is_coding_test_book.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,2,8,1,10,15,3242,252,11111};
        int target = 10;

        Arrays.sort(arr);

        int recursive = recursive(arr, 10, 0, arr.length);
        System.out.println(recursive);

        int loop = loop(arr, 10);
        System.out.println(loop);
    }

    private static int loop(int[] arr, int target) {
        int start =0;
        int end = arr.length;

        while(start<end){
            int mid = (start+end)/2;

            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

    private static int recursive(int[] arr, int target, int start, int end) {
        if(start>end) return -1;
        int mid = (start+end)/2;

        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return recursive(arr,target,start,mid-1);
        else return recursive(arr,target,mid+1,end);
    }
}
