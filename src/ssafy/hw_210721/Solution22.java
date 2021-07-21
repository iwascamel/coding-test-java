package ssafy.hw_210721;

import java.util.Scanner;



public class Solution22 {

    static int T;
    static int N,S;
    static int[][] arr;
    static int number;
    static int[][] strider;

    // 상하좌우 첫 값은 쓰레기값
    static int[] dx = {99,-1,1,0,0};
    static int[] dy = {99,0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T= sc.nextInt();

        for(int t=1;t<T+1;t++){

            number = 0;
            // 조건
            N = sc.nextInt();
            S = sc.nextInt();
            arr = new int[N][N];
            // 로직
            strider = new int[S][3];
            for(int i=0;i<S;i++){
                strider[i][0] = sc.nextInt();
                strider[i][1] = sc.nextInt(); // ex) [6,2]
                strider[i][2] = sc.nextInt(); // 방향
            }
            for(int i=0;i<S;i++){
                int count=3;
                while(count>0){
                    int nx = strider[i][0]+dx[strider[i][2]] * count;
                    int ny = strider[i][1]+dy[strider[i][2]] * count;

                    if(nx>=0 && ny >= 0 && nx<=N-1 && ny<=N-1 && arr[nx][ny]!=-1){

                        strider[i][0] = nx;
                        strider[i][1] = ny;

                        count -=1;

                        if(count == 0){
                            number +=1;
                            arr[nx][ny] =-1;
                        }
                    }else{
                        break;
                    }
                }
            }
            // 출력
            System.out.println("#" + t + " " + number);
        }
    }
}
/*
3
9 5
6 2 4
1 5 2
0 0 4
6 6 1
2 4 3
11 6
0 0 4
6 0 1
2 4 3
4 2 4
1 5 2
10 8 1
7 5
5 2 1
1 6 2
0 6 3
1 0 2
2 4 4
 */