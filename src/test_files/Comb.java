package test_files;

import java.util.ArrayList;
import java.util.List;

public class Comb {

    static List<List<Integer>> wholeList = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5}; //조합을 만들 배열
        boolean[] visited = new boolean[arr.length];

        comb1(arr, visited, 0, 3);
    }

    static void comb1(int[] arr, boolean[] visited, int start, int r) {
        if(r == 0) {
            print(arr, visited,r);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    static void print(int[] arr, boolean[] visited,int r) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(visited[i]){
                list.add(arr[i]);
            }
        }
        wholeList.add(list);
    }

}