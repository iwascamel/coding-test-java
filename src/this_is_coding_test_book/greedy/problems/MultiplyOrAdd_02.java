package this_is_coding_test_book.greedy.problems;

/*
각 자리수를 더하거나 곱할 수 있을 때
만들 수 있는 최대값?

sol => 규칙찾기
 */

public class MultiplyOrAdd_02 {
    public static void main(String[] args) {
        String data = "02984";
        String data2 = "567";

        solution(data2);
    }

    private static void solution(String data) {
        char[] chars = data.toCharArray();
        int[] ints = new int[chars.length];

        for(int i=0;i<chars.length;i++){
            ints[i] = Character.getNumericValue(chars[i]);
        }
        int func = func(ints);
        System.out.println(func);
    }

    private static int func(int[] data) {
        int result =0;

        if(data[0] == 1 || data[0] == 0 || data[1] == 0 || data[1] == 1){
            result = data[0]+data[1];
        }else{
            result = data[0]*data[1];
        }

        for(int i=1;i<data.length-1;i++){
            if(data[i] == 1 || data[i] == 0 || data[i+1] == 0 || data[i+1] == 1){
                result = result + data[i+1];
            }else{
                result = result * data[i+1];
            }
        }
        return result;
    }
}
