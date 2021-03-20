package coding_test_collections.line_210320;

import java.util.*;

public class Number3 {
    public static void main(String[] args) {
        int[] enter = {1,4,2,3};
        int[] leave = {2,1,3,4};

        solution(enter,leave);
    }

    private static void solution(int[] enter, int[] leave) {
        List<int[]> list = new ArrayList<>();

        List<Integer> inList = new ArrayList<>();

        int pointer=0;
        for(int i=0;i<enter.length;i++){
            inList.add(enter[i]);

            if(inList.size()>=2){
                for(int j=0;j<inList.size();j++){
                    for(int k=j+1;k<inList.size();k++){
                        list.add(new int[]{j,k});
                    }
                }
                for(int j=inList.size()-1;j>1;j--){
                    for(int k=j-1;k>1;k--){
                        list.add(new int[]{j,k});
                    }
                }
            }

                for(int n=0;n<inList.size();n++){
                    for(int m=pointer;m<leave.length;m++){
                        if(inList.get(n)==leave[m]){
                            Integer integer = inList.get(n);
                            inList.remove(integer);
                        }
                        pointer++;
                    }
                }
        }
        for (int[] ints : list) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
