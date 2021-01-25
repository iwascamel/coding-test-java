package inflearnLecture.dp;

/*
dp ( dynamic programming ) = 전에값 저장하기

case 나누어서 전의 값 + 전의 값 = 다음 밧
 */

public class UniquePath {
    public static void main(String[] args) {
        int m=7, n=3;

        System.out.println(solution(m,n));
    }

    private static int solution(int m, int n) {
        Integer[][] map = new Integer[m][n];

        for(int i=0;i<m;i++){
            map[i][0]=1;
        }
        for(int i=0;i<n;i++){
            map[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                map[i][j]=map[i-1][j]+map[i][j-1];
            }
        }
        return map[m-1][n-1];
    }
}
