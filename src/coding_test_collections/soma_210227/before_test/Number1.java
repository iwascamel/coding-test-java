package coding_test_collections.soma_210227.before_test;

/*
String 에서 ( 갯수와 ) 갯수가 일치하는지
일치하면 YES
일치하지 않으면 NO 를 출력하라
 */

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String s = "(())()()";

        boolean solution = solution(next);
        System.out.println(solution);
    }

    private static boolean solution(String s) {

        int countA=0;
        int countB=0;

        boolean result;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(')
                countA++;
            if(c==')')
                countB++;
        }
        if(countA==countB) result=true;
        else result=false;

        return result;
    }
}
