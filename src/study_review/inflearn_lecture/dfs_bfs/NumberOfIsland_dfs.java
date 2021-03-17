package study_review.inflearn_lecture.dfs_bfs;

/*
21-03-15
 */

public class NumberOfIsland_dfs {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1,0,1},
                {1,1,0,0,0},
                {1,1,0,0,1},
                {0,0,0,0,1}
        };

        int solution = solution(grid);
        System.out.println("=====");

        System.out.println(solution);
    }

    static int[][] dirs = {
            {-1,0},{1,0},{0,-1},{0,1}
    };

    private static int solution(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;

        int row = grid.length;
        int column = grid[0].length;

        int count=0;


        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]==1){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        print(grid);
        return count;
    }

    private static void dfs(int[][] grid, int i, int j) {

        int row = grid.length;
        int column = grid[0].length;

        if(i<0||i>=row||j<0||j>=column || grid[i][j]!=1) return ;

        grid[i][j]=7;

        for(int[] k : dirs){
            dfs(grid,i+k[0],j+k[1]);
        }
    }

    private static void print(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
