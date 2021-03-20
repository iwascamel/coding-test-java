package this_is_coding_test_book.realize;

public class LuckyStrike {
    public static void main(String[] args) {
        String t1 = "123402";
        String t2 = "7755";

        String solution = solution(t2);
        System.out.println(solution);
    }

    private static String solution(String s) {
        int[] change = new int[s.length()];

        int left = 0;
        int right =0;

        for(int i=0;i<s.length()/2;i++){
            change[i] = s.charAt(i)-'0';
            left += change[i];
        }
        for(int i=s.length()/2;i<s.length();i++){
            change[i] = s.charAt(i)-'0';
            right += change[i];
        }

        if(left==right){
            return "LUCKY";
        }else{
            return "READY";
        }

    }
}
