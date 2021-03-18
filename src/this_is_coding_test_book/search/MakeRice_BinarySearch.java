package this_is_coding_test_book.search;

/*
21-03-18
떡볶이 만들기
이진탐색을 활용해서 ( 입력값이 너무 많아서 내 정답은 틀린 것 )
201page
 */

public class MakeRice_BinarySearch {
    public static void main(String[] args) {
        int X = 6;
        int[] array = {19, 15, 10, 17};
//        Arrays.sort(array);
        int solution = solution(array, X);
        System.out.println(solution);
    }

    private static int solution(int[] array, int x) {
        int start = 0;
        int end = array[array.length-1];
        int result=0;
        while(start<=end){
            long total=0;
            int mid = (start+end)/2;
            for(int i=0;i<array.length;i++){
                if(array[i]>mid) {
                    total += array[i]-mid;
                }
            }
//            if(total>x){
//                result=mid;
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }                 => ? 이 부분 이상하네

            if (total < x) { // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
                end = mid - 1;
            }
            else { // 떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
                result = mid; // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록
                start = mid + 1;
            }
        }
        return result;
    }
}
