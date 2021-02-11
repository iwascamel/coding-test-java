package this_is_coding_test_book.greedy;

/*
📌 Chapter03 . 그리디 92page
문제)
arr = 2,4,5,4,6 이런식으로 주어지고
M = 8, K = 3이면
K는 연속적으로 더할 수 있는 최대 숫자
M은 총 숫자

6 6 6 5 6 6 6 5

규칙에 따라 최대의 합을 만드는 값은?
 */

public class LawOfBigNumber {

    static int[] getFirstAndSecond(int[] arr){
        int first=0;
        int second=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]>second){
                second=arr[i];
            }
        }
        return new int[]{first,second};
    }

    public static void main(String[] args) {
        int M = 8;
        int K = 3;
        int[] array = {2,4,5,4,6};

        int solution = solution(array, M, K);
        System.out.println(solution);
    }

    private static int solution(int[] array, int m, int k) {

        int secondNumber = m%k;
        int[] max = new int[]{0,0};
        int maxIndex = 0;

        int[] firstAndSecond = getFirstAndSecond(array);
        int result = firstAndSecond[0]*(m-secondNumber) + firstAndSecond[1]*secondNumber;

        return result;
    }
}
