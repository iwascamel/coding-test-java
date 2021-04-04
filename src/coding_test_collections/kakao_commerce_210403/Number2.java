package coding_test_collections.kakao_commerce_210403;

import java.util.ArrayList;
import java.util.List;

public class Number2 {

    static List<List<Integer>> wholeList = new ArrayList<>();

    public static void main(String[] args) {
        int[][] needs = {
                {1,0,0},
                {1,1,0},
                {1,1,0},
                {1,0,1},
                {1,1,0},
                {0,1,1}
        };

        int r=2;
        int solution = solution(needs, r);
        System.out.println(solution);

    }

    private static int solution(int[][] needs, int r) {

        int count=0;

        int[] arr = new int[needs[0].length];

        for(int i=0;i<needs[0].length;i++){
            arr[i]=i;
        }
        boolean[] visited = new boolean[arr.length];

        comb1(arr, visited, 0, r);

        int[] temp = new int[needs[0].length];

        for(int i=0;i<needs.length;i++){

            for(int j=0;j<needs[0].length;j++){
                if(needs[i][j]==0) temp[j]=1;
            }

            for(List<Integer> li : wholeList){
                for (Integer integer : li) {
                    if (temp[integer] == 1) break;
                    else if(needs[i][integer]==1){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    static void comb1(int[] arr, boolean[] visited, int start, int r) {
        if(r == 0) {
            save(arr, visited,r);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    static void save(int[] arr, boolean[] visited, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(visited[i]){
                list.add(arr[i]);
            }
        }
        wholeList.add(list);
    }
}
