package ssafy.hw_210723;

// X 상하좌우의 합을 구하라
public class SumX {
    public static void main(String[] args) {
        char[][] arr = {
                {'2','3','1','4'},
                {'1','X','3','2'},
                {'3','4','X','X'},
                {'X','4','1','5'}
        };

        int result= 0;

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        for(int i=0;i<arr.length; i++){
            for (int j=0;j<arr.length;j++){
                if ( arr[i][j] == 'X'){
                    for(int k=0;k<4;k++){
                        int nx = Integer.parseInt(String.valueOf(i)) + dx[k];
                        int ny = Integer.parseInt(String.valueOf(j)) + dy[k];

                        if( nx >=0 && nx<=arr.length-1 && ny>=0 && ny<=arr.length-1 && arr[nx][ny]!='X'){
                            result += arr[nx][ny]-'0';
                        }
                    }
                }
            }
        }
        System.out.println(result);

    }
}
