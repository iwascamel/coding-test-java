package coding_test_collections.soma_210227.test;

import java.util.Scanner;

/*
발판밟기

1,2,3번째 발판 밟을 때 최대값
이미 밟았던 발판을 밟았을 때 멈추기
 */

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] array = new int[N];

        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }

        int solution = solution(array);
        System.out.println(solution);
    }

    private static int solution(int[] array) {

        int[] max = new int[3];
        int count=0;

        for(int N=0;N<3;N++){
            int i = N;
            while(true){
                int save = array[i];
                if(save==0) break;
                array[i]=0;
                i += save;
                count++;
                max[N]=count;
            }
        }

        int result=0;

        for(int i=0;i<max.length;i++){
            result = Math.max(result,max[i]);
        }
        return result;
    }
}
