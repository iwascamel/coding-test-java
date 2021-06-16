package the_coding_interview.chap1_string_and_array;

public class Num4Palindrome {
    public static void main(String[] args) {
        String s1 = "taccocqd";
        String s2 = "occcadqt";

        boolean solution = solution(s1, s2);
        System.out.println(solution);
    }
    public static boolean solution(String s1,String s2){
        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i) != s2.charAt(s2.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
