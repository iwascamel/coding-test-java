package this_is_coding_test_book.greedy.problems_review;

public class FlipString {
    public static void main(String[] args) {
        String s = "000110001111000101";

        int solution = solution(s);
        System.out.println(solution);
    }

    private static int solution(String s) {
        int count1 = 0;
        int count0 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                int j = i;
                while(true){
                    if(j+1<s.length()){
                        if (s.charAt(j + 1) == '0' || j > s.length() - 1) {
                            break;
                        }
                        j++;
                    }
                }
                i = j + 1;
                count1++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                int j = i;
                if (j + 1 < s.length()) {
                    if (s.charAt(j + 1) == '1') {
                        j++;
                    }
                }
                i = j + 1;
                count0++;
            }
        }
        int count = Math.min(count0, count1);
        System.out.println("count0 = " + count0);
        System.out.println("count1 = " + count1);
        return count;
    }
}
