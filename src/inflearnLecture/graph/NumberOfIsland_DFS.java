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
        Integer solution = solution(data);
        System.out.println(solution);
    }
    private static Integer solution(char[][] data) {
           if(data == null || data.length==0 || data[0].length==0) return 0;

           int count =0;
           for(int i=0;i<data.length;i++){
               for(int j=0;j<data[i].length;j++){
                   if(data[i][j]=='1'){
                       // 들어가는 순간 count 는 + 된다.
                       count++;
                       // 역병함수로 들어가는 순간 근처 1있는 놈은 전부 X처리
                       dfs(data,i,j);
                   }
               }
           }
            return count;
    }
    // 역병함수
    private static void dfs(char[][] data,int i,int j) {
        int m= data.length;
        int n = data[0].length;
        // 여기 에러처리가 포인트. 당사자가 X 를 안해줘도 옆에 있는 놈이 X 처리를 해준다
        // 양 끝을 벗어나거나, 1이 아니면 나감
        if(i<0||i>m-1||j<0||j>n-1||data[i][j]!='1') return ;
        data[i][j]='X';

        dfs(data,i-1,j);
        dfs(data,i+1,j);
        dfs(data,i,j-1);
        dfs(data,i,j+1);
    }
}
