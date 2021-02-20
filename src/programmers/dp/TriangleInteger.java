package programmers.dp;

public class TriangleInteger {
    public static void main(String[] args) {
        int[][] data= {
                {7},
                {3,8},
                {8,1,0},
                {2,7,4,4},
                {4,5,2,6,5}
        };
        solution(data);
    }

    /*
    양 쪽 끝값들 숫자 먼저 넣어주기
    다음 값 = 전의 위 값들 2개
    data[i][j] = Math.max(data[i-1][j], data[i-1][j-1]) + triangle[i][j]
     */

    private static int solution(int[][] triangle) {
         int l = triangle.length;


        int[][] result = new int[l][l];

        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                result[i][j]=0;
            }
        }

        result[0][0]=triangle[0][0];

        for(int i=1;i<l;i++){
            result[i][0]= triangle[i][0]+result[i-1][0];
            result[i][i]= triangle[i][i]+result[i-1][i-1];
        }

        for(int i=2;i<l;i++){
            for(int j=1;j<triangle[i].length;j++){
                result[i][j]= Math.max(result[i-1][j],result[i-1][j-1])+triangle[i][j];
            }
        }

        int max=0;

        for(int i=0;i< result.length;i++){
            max = Math.max(max,result[l-1][i]);
        }

        return max;
    }

    private static void print(int[][] result) {
        for(int i=0;i< result.length;i++){
            for(int j=0;j< result.length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
