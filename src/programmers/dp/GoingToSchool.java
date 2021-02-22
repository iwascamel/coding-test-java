package programmers.dp;

public class GoingToSchool {
    public static void main(String[] args) {
            int m=4;
            int n=3;
            int[][] puddles = {
                    {2,2},
                    {2,3},
                    {3,3}
            };
        int solution = solution(m, n, puddles);
        System.out.println(solution);
    }

    private static int solution(int m, int n, int[][] puddles) {

        int lm = n;
        int ln = m;

        int[][] result = new int[n][m];

        for(int i=0;i<lm;i++){
            result[i][0]=1;
            for(int j=0;j<ln;j++){
                result[0][j]=1;
            }
        }

        for(int i=0;i< puddles.length;i++){
                int i1 = puddles[i][0];
                int i2 = puddles[i][1];

                result[i1-1][i2-1]=0;
        }

        for(int i=1;i<lm;i++){
            for(int j=1;j<ln;j++){
                boolean flag=false;
                for(int k=0;k< puddles.length;k++){
                        int i1 = puddles[k][0]-1;
                        int j1 = puddles[k][1]-1;

                    if (i == i1 && j == j1) {
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    result[i][j]=0;
                }else{
                    result[i][j]=result[i-1][j]+result[i][j-1];
                }
            }
        }
        int max=0;

        print(result);

        for(int i=0;i<result[0].length;i++){
            max = Math.max(max,result[result.length-1][i]);
        }

        return max;
    }
    private static void print(int[][] result) {
        for(int i=0;i< result.length;i++){
            for(int j=0;j< result[i].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
