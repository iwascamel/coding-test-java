package coding_test_collections.naver_knoweldge_210213;

/*
숫자 두개 들어오면 두 수의 곱을 Binary (이진수) 로 바꾼다음에
이진수 안에 있는 1의 숫자를 세라
 */

public class Number1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        int solution = solution(a, b);
        System.out.println(solution);
    }

    private static int solution(int a, int b) {
        String s = Integer.toBinaryString(a * b);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
