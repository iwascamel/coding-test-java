package ssafy.hw_210723;

import java.util.Scanner;

/*
https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE&problemTitle=%EB%8B%AC%ED%8C%BD%EC%9D%B4&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
1954. 달팽이 숫자
 */

public class SnailLecture {

    static int T;
    static int N;
    static int [][] map;

    // 우 하 좌 상
    static int [] dx = {0,1,0,-1};
    static int [] dy = {1,0,-1,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T= sc.nextInt();
        for(int t=1;t<=T;t++){
            N = sc.nextInt();
            map = new int[N][N];

            int r=0; // 시작점
            int c=0;
            int d=0; // 방향

            for(int i=0;i<N;i++){
                for (int j=0;j<N;j++){
                    map[r][c] = i*N +j+1;
                    if(!check(r+dx[d],c+dy[d]) || map[r+dx[d]][c+dy[d]] !=0){
                        d = (d+1)%4;
                    }
                    r+=dx[d];
                    c+=dy[d];
                }
            }
            System.out.print("#"+t+"\n");

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    private static boolean check(int nr, int nc) {
        return nr>=0 && nr<N && nc >=0 && nc<N;
    }
}
