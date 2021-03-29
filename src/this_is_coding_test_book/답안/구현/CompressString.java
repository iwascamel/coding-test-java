package this_is_coding_test_book.답안.구현;

public class CompressString {
    public static void main(String[] args) {
        String s = "abcabcabcabcdedededede";

        int solution = solution(s);
        System.out.println(solution);
    }

    private static int solution(String s) {
        int answer = s.length();

        for(int step=1;step<s.length()/2+1; step++){
            String compressed = "";
            String prev = s.substring(0,step);
            int count=1;

            for(int j=step;j<s.length();j+=step){
                String sub = "";
                for(int k=j;k<j+step;k++){
                    if(k<s.length()) sub += s.charAt(k);
                }
                if(prev.equals(sub)) count++;
                else{
                    compressed += (count>=2) ? count+prev : prev;
                    sub = "";
                    for(int k=j;k<j+step;k++){
                        if(k<s.length()) sub += s.charAt(k);
                    }
                    prev=sub;
                    count=1;
                }
            }
            compressed += (count>=2) ? count+prev : prev;
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }
}
