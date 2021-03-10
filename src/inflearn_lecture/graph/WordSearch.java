package inflearn_lecture.graph;

/*
{A,B,C,E}
{S,F,C,S}
{A,D,E,E}

input : {A,B,C,C,E,D}

output : true

A,B,C,C,E,D 가 연결된 형태로 존재하기 때문

bfs => 조건이 모두 맞는 경우에 들어옴
dfs => 조건이 하나라도 틀리는 경우 나감
 */

public class WordSearch {
    public static void main(String[] args) {
        char[][] data = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCEDA";
        boolean solution = solution(data, word);
        System.out.println(solution);
    }
    static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    static int ROW, COL;
    private static boolean solution(char[][] data,String word) {
        ROW =data.length;
        COL =data[0].length;

        boolean[][] visited = new boolean[ROW][COL];
        for(int i = 0; i< ROW; i++){
            for(int j = 0; j< COL; j++){
                if(dfs(data,visited,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] data, boolean[][] visited, int x, int y, int start, String word) {
        if(start==word.length()) return true;
        if(x<0||x>= ROW ||y<0|| y>= COL) return false;
        if(visited[x][y]) return false;

        if(data[x][y]!=word.charAt(start)) return false;
        visited[x][y]=true;

        for(int[] dir:dirs){
            int dx= x+dir[0];
            int dy= y+dir[1];
            if(dfs(data,visited,dx,dy,start+1,word)){
                return true;
            }
        }
        visited[x][y]=false;
        return false;
    }
}
