package inflearnLecture.string_array;

/*
배열이 주어질 때, 1이 더해지면 출력되는 배열을 구하라

패스
 */

public class PlusOne {
    public static void main(String[] args) {

    }
    public static int[] solution(int digits[]){
        int index = digits.length-1;
        int carry=1;

        while(index>=0 && carry>0){
            digits[index] = (digits[index]+1) % 10;

        }
        return null;
    }
}
