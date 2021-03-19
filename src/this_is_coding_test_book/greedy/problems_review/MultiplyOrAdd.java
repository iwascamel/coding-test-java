package this_is_coding_test_book.greedy.problems_review;

public class MultiplyOrAdd {
    public static void main(String[] args) {
        String s = "02984";
        String s2 = "567";

        int solution = solution(s2);
        System.out.println(solution);
    }

    private static int solution(String s) {
        int counter = s.charAt(0)-'0';

        for(int i=1;i<s.length();i++){
            int current = s.charAt(i)-'0';
            if(counter<=1 || current<=1){
                counter += current;
            }else{
                counter *= current;
            }
        }
        return counter;
    }
}
