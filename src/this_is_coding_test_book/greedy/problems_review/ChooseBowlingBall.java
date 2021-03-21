package this_is_coding_test_book.greedy.problems_review;

public class ChooseBowlingBall {
    public static void main(String[] args) {
        int[] a = {1,5,4,3,2,4,5,2};
        int[] a2 = {1,3,2,3,2};

        int solution = solution(a2);
        System.out.println(solution);
    }

    private static int solution(int[] a) {
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]!=a[j]) count++;
            }
        }
        return count;
    }
}
