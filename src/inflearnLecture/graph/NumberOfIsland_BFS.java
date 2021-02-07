package inflearnLecture.graph;

/*
문제는 DFS 와 동일

BFS 는 바베큐 . 큐를 사용한다고 생각
 */

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS {
    public static void main(String[] args) {
        char [][] data = {
                {'1','1','1','0','1'},
                {'1','1','0','0','0'},
                {'1','1','0','0','1'},
                {'1','1','0','0','1'},
                {'0','0','0','0','1'}
        };
        Integer solution = solution(data);
        System.out.println(solution);
    }

    private static Integer solution(char[][] data) {

        int count =0;

        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                if(data[i][j]=='1'){
                    count++;
                    bfs(data,i,j);
                }
            }
        }
        return count;
    }
    static int [][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    private static void bfs(char[][] data, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        while(!queue.isEmpty()){
            int size = queue.size();
            int[] point = queue.poll();
            for(int i=0;i<size;i++){
                for(int[] dir:dirs){
                    int x1 = point[0]+dir[0];
                    int y1 = point[1]+dir[1];
                    if(x1>=0 && y1>=0 && x1<data.length && y1 < data[0].length && data[x1][y1]=='1'){
                        data[x1][y1]='0';
                        queue.offer(new int[] {x1,y1});
                    }
                }
            }
        }
    }
}
