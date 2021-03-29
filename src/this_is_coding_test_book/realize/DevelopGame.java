package this_is_coding_test_book.realize;

import java.util.Scanner;

/*
21-03-29
input :
4 4 N X M
1 1 0 위치 / 방향
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1
0 육지 / 1 바다
 */

public class DevelopGame {

    public static int n,m,x,y,direction;

    // 방문한 위치
    public static int[][] d= new int[50][50];

    // 전체 맵 정보
    public static int[][] arr = new int[50][50];

    // 북 동 남 서
    public static int dx[] = {-1,0,1,0};
    public static int dy[] = {0,1,0,-1};

    public static void turn_left(){
        direction -= 1;
        if(direction == -1) direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y]=1; // 현재 좌표 방문처리

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 1;
        int turn_time = 0;
        while(true){
            turn_left();
            int nx = x+dx[direction];
            int ny= y+dy[direction];

            if(d[nx][ny]==0 && arr[nx][ny] ==0 ){
                d[nx][ny]=1;
                x=nx;
                y=ny;
                cnt++;
                turn_time=0;
                continue;
            }else turn_time++;

            if(turn_time==4){
                nx=x-dx[direction];
                ny=y-dy[direction];

                if(arr[nx][ny]==0){
                    x=nx;
                    y=ny;
                }else break;

                turn_time=0;
            }
        }
        System.out.println(cnt);
    }
}
