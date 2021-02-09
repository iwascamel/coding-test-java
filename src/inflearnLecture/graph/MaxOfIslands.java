package inflearnLecture.graph;

/*
육지 크기의 최대를 구하라
 */

public class MaxOfIslands {
    public static void main(String[] args) {
        int [][] data = {
                {1,1,0,1,1},
                {0,1,1,0,0},
                {0,0,0,0,0},
                {1,1,0,1,1},
                {1,0,1,1,1},
                {1,0,1,1,1}
        };
        int solution = solution(data);
        print(data);
        System.out.println(solution);
    }

    static int [][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

    private static int solution(int[][] data) {
        int rowLength = data.length;
        int columnLength = data[0].length;
        int max=0;

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<columnLength;j++){
                int number = dfs(data, i, j, 0);
                max = Math.max(max,number);
            }
        }
        return max;
    }

    private static int dfs(int[][] data, int i, int j, int size) {
        if(i<0||i>=data.length||j<0||j>=data[0].length||data[i][j]==0) return size;

        for(int[] pointer : dirs){
            if(data[i][j]==1){
                size++;
                data[i][j]=0;
            }
            size = dfs(data, i + pointer[0], j + pointer[1], size);
        }
        return size;
    }
    static void print(int[][] data){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
