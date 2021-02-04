package inflearnLecture.graph;

/*
1,1,1,0,1
1,1,0,0,0
1,1,0,0,1
0,0,0,0,1

1은 육지, 0은 섬 육지의 갯수?

output : 3
 */

public class NumberOfIsland_DFS {
    public static void main(String[] args) {
        char [][] data = {
                {'1','1','1','0','1'},
                {'1','1','0','0','0'},
                {'1','1','0','0','1'},
                {'1','1','0','0','1'},
                {'0','0','0','0','1'}
        };
        solution(data);
    }
    private static Integer solution(char[][] data) {
           if(data == null || data.length==0 || data[0].length==0) return 0;
            return 1;
    }
}
