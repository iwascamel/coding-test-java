package this_is_coding_test_book.bfs_dfs;

/*
21-03-18
152 page
 */

import java.util.LinkedList;
import java.util.Queue;

public class EscapeToTheMaze {
    public static void main(String[] args) {

        int[][] grid = {
            {1,0,1,0,1,0},
            {1,1,1,1,1,1},
            {0,0,0,0,0,1},
            {1,1,1,1,1,1},
            {1,1,1,1,1,1}
        };

        solution(grid);
        print(grid);
    }

    private static void solution(int[][] grid) {
        bfs(grid);
    }

    static int[][] dirs = {
            {-1,0},{1,0},{0,-1},{0,1}
    };

    private static void bfs(int[][] grid) {
        // error 체크

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0,0});

        while(!q.isEmpty()){
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];

            // 이 부분 조심 ++value
            int value = grid[x][y];

            for(int[] dir:dirs){
                int x1 = x+dir[0];
                int y1 = y+dir[1];

                if(x1>=0 && x1<grid.length && y1>=0 && y1<grid[0].length && grid[x1][y1]==1){
                    grid[x1][y1]=grid[x][y]+1;
                    q.offer(new int[]{x1,y1});
                }
            }
        }
    }
    private static void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("====");
    }
}
