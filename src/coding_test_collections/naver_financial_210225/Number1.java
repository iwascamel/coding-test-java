package coding_test_collections.naver_financial_210225;

/*
String 배열에서
index 가 같은 값을 갖는 배열의 index 와 그 때의 위치를 반환
ex)
{"abc","cba"} = {0,1,2}

0번 ,1번 같고 2번째 index 가 같다
 */

public class Number1 {
    public static void main(String[] args) {
        String[] s = {"gr","sd","rg"};

        int[] solution = solution(s);

    }

    private static int[] solution(String[] S) {
        int[] result = new int [3];
        int[] result2 = {};
        int s = S.length;

        if(s==0) return result2;

        result[0]=-1;

        for(int i=0;i<S.length;i++){
            for(int j=i+1;j<S.length;j++){
                for(int k=0;k<S[0].length();k++){
                    char c = S[i].charAt(k);
                    char c1 = S[j].charAt(k);

                    if(c==c1){
                        result[0]=i;
                        result[1]=j;
                        result[2]=k;
                    }
                }
            }
        }

        if(result[0]==-1){
            return result2;
        }
        return result;
    }
}
