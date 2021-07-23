package ssafy.hw_210723;

import java.util.Scanner;

public class SnailSWExpert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCaseQuantity = sc.nextInt();

        for(int k=0;k<testCaseQuantity;k++){

            // 0 하 1 좌 2 상 3 우
            int direction = 0;
            int arrSize = sc.nextInt();

            int[] current = {0,arrSize-1};
            int[] count = {arrSize-1,2};

            int[][] arr = new int[arrSize][arrSize];

            for(int i=0;i<arrSize;i++){
                arr[0][i] = i+1;
            }
            switch (direction){
                case 0:
                    if(count[1]>0){
                    }

            }

        }
    }
    public static void print(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
