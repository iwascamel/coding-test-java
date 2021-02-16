package programmers.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MakeBigNumber {
    public static void main(String[] args) {
        String number = "4177252841";
        String number2 = "1231234";
        int k2 = 3;
        int k = 4;

        String number3 = "1924";
        int k3=4;

        solution(number3,k3);
    }

    private static String solution(String number, int k) {
        char[] numberCharArray = number.toCharArray();
        int[] numberIntArray = new int[numberCharArray.length];

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<numberCharArray.length;i++){
            numberIntArray[i]=Character.getNumericValue(numberCharArray[i]);
        }

        for(int i=0;i<numberIntArray.length; i++){
            if(k>0){
                for(int j=0;j<k;j++){
                    if(i+j+1<numberIntArray.length){
                        if (k==(numberIntArray.length-i)){
                            break ;
                        }
                        int compare = numberIntArray[i+j+1];
                        if(numberIntArray[i]<compare){
                            k--;
                            numberIntArray[i]=-100;
                            break;
                        }
                    }
                }
                if (k==(numberIntArray.length-i)){
                    break ;
                }
            }
        }
        for(int i=0;i< numberCharArray.length;i++){
            if(numberIntArray[i]>0){
                list.add(numberIntArray[i]);
            }
        }

        String collect = list.stream().map(String::valueOf).collect(Collectors.joining());

        return collect;
    }
}
