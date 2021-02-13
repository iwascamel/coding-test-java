package coding_test_collections.naver_knoweldge_210213;

/*
주어진 숫자에서 ( 음수값도 주어진다 ) 최대가 되게 5를 집어넣어라
ex)
268 => 5268
0 => 50
22214 => 522214
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number2 {

    public static void main(String[] args) {
        int data = -999;
        int data2 = 67722214;

        int solution = solution(data);
        System.out.println(solution);
    }

    private static int solution(int N) {
        /*
        📌 양수일때
        list 에 값 하나하나 저장
        맨 앞의 값부터 비교
        if( 그때의 값 < 5 ) : 앞에 배치
        else : 뒤로
        else if : index 가 마지막? : 마지막에 배치
        📌 0 일때
        return 50
        📌 음수일 때
        - 곱해서 양수로 만들어주고
        양수일때의 부호 반대로
        마지막에 - 곱해서 음수 만들어줌
         */

        int result=0;
        List<Integer> li = new ArrayList<>();
        if (N > 0) {
            int eachValue;
            while (N > 0) {
                eachValue = N % 10;
                li.add(eachValue);
                N = N / 10;
            }
            Collections.reverse(li);
            for(int i=0;i<li.size();i++){
                if(li.get(i)<=5){
                    li.add(i,5);
                    break;
                }
            }
            Collections.reverse(li);

            for(int i=0;i<li.size();i++){
                double pow = Math.pow(10, i);
                int size = (int)pow;
                result = result + li.get(i)*size;
            }
            return result;
        }else if(N==0){
            return 50;
        }else{
            int eachValue;
            N = N*(-1);
            while (N > 0) {
                eachValue = N % 10;
                li.add(eachValue);
                N = N / 10;
            }
            Collections.reverse(li);
            for(int i=0;i<li.size();i++){
                if(li.get(i)>=5){
                    li.add(i,5);
                    break;
                }
            }
            Collections.reverse(li);

            for(int i=0;i<li.size();i++){
                double pow = Math.pow(10, i);
                int size = (int)pow;
                result = result + li.get(i)*size;
            }
            return result*(-1);
        }
    }
}