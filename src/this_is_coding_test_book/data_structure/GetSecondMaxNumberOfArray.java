package this_is_coding_test_book.data_structure;

/*
배열에서 두번째 큰수를 반환
 */

public class GetSecondMaxNumberOfArray {

    static int[] get(int[] arr){
        int first=0,second=0;

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

        int[] arr = {2,4,6,87,111};

        int[] ints = get(arr);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
