package this_is_coding_test_book.greedy.problems;

/*
서로 무게가 다른 볼링공을 선택하기
 */

public class ChooseBowlingBall_05 {
    public static void main(String[] args) {

        int[] data = {1,5,4,3,2,4,5,2};
        int m=5;

        int solutionM = solutionM(data);
        System.out.println(solutionM);
    }

    private static int solutionM(int[] data) {
        int count=0;

        for(int i=0;i<data.length;i++){
            for(int j=i;j<data.length;j++){
                if(data[i]!=data[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
