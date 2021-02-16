package programmers.greedy;

/*
이름을 바꾸는데 움직인 횟수
AAA 에서 시작
길이는 더 길수도 짧을수도 있음
양쪽 끝에서 이동 가능
A - Z 위 아래로 이동 가능
 */

import java.util.ArrayList;
import java.util.List;

public class JoyStick {
    public static void main(String[] args) {
        String data = "JEROEN";
        String data2= "JAN";
        String data3 = "JAZ";
        String data4 = "ZZZZ";
        String data5 = "BAAABAA";
        String data6= "AAAABA";

        int solution = solution(data6);
        System.out.println(solution);
    }

    private static int solution(String name) {
        char[] chars = name.toCharArray();
        int[] ints = new int[chars.length];
        int result =0;

        // A : 65 Z : 90
        for(int i=0;i<chars.length;i++){
            ints[i]= chars[i];
        }
        int[] counts = new int[ints.length];

        // 여까지는 변환 string to char to int


        // 알파벳 변환
        for(int i=0;i<counts.length;i++){
            int forward = ints[i]-65;
            int reverse = 90-ints[i]+1;
            counts[i]= Math.min(forward,reverse);
        }
        for(int i : counts) {
            result += i;
        }

        // 움직이는 횟수 <-- 여기서 문제
       int countForward = countForward(ints);
        int countReverse = countReverse(ints);
        System.out.println("countReverse = " + countReverse);
        System.out.println("countForward = " + countForward);

        int count = Math.min(countReverse, countForward);

        if(result+count<0) return 0;
        return result+count;
    }

    private static int countReverse(int[] ints) {
        int result=0;
        for(int i=ints.length-1;i>0;i--){
                if(reverseCheckNext(i,ints)) {
                    result--;
                    break;
                }
                result++;
        }
        return result+1;
    }

    private static boolean reverseCheckNext(int n, int[] ints) {

        List<Integer> list = new ArrayList<>();

        for(int i=n;i>0;i--){
            list.add(ints[i]);
        }

        for(int k=n;k>0;k--){
            for (Integer integer : list) {
                if(integer!=65) return false;
            }
        }
        return true;
    }

    private static int countForward(int[] ints) {
        int result =0;
        for(int i=1;i<ints.length;i++){
                if(forwardCheckNext(i,ints)){
                    result --;
                    break ;
                }
                result++;
        }
        return result;
    }

    private static boolean forwardCheckNext(int n, int[] ints) {
        List<Integer> list = new ArrayList<>();

        for(int i=n;i<ints.length;i++){
            list.add(ints[i]);
        }

        for(int k=n;k<ints.length;k++){
            for (Integer integer : list) {
                if(integer!=65) {
                    return false;
                }
            }
        }
        return true;
    }
    /*
    고려 안한거
    1. A->Z
    2. 왼쪽 -> 오른쪽 한번에 움직이는 거
     */

}
