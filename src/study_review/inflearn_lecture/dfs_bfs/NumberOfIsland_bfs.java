package study_review.inflearn_lecture.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_bfs {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 0, 1},
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 0, 1}
        };

        int solution = solution(grid);
        System.out.println(solution);
    }

    private static int solution(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    bfs(grid, i, j);

                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    print(grid);
                }
            }
        }
        return count;
    }

    static int[][] dirs = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    private static void bfs(int[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{i, j});

        while (!q.isEmpty()) {
            int[] poll = q.poll();

            int x1 = poll[0];
            int y1 = poll[1];

            grid[x1][y1]=9;

            for (int[] dir : dirs) {
                int x2 = x1 + dir[0];
                int y2 = y1 + dir[1];

                if (x2 >= 0 && x2 < grid.length && y2 >= 0 && y2 < grid[0].length && grid[x2][y2] == 1) {
                    q.offer(new int[]{x2, y2});
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
