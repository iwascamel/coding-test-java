package sort_series;

public class QuickSortTry2 {
    public static void main(String args[]) {
        int[] data = {4, 112,23, 2412, 23, 43, 5, 7};
        quick(data, 0, data.length-1);
        for(int i:data){
            System.out.print(i + " ");
        }
    }

    static void quick(int data[], int start, int end) {

        if(start>=end){
            return ;
        }
        int left, right, temp, pivot;

        left = start + 1;
        right = end;
        pivot = start;

        while (left <= right) {
            while (data[pivot] >= data[left] && left <= end) {
                left++;
            }
            while (data[pivot] <= data[right] && right > pivot) {
                right--;
            }
            if (left < right) {
                temp = data[left];
                data[left]=data[right];
                data[right]=temp;
            }else{
                temp = data[pivot];
                data[pivot] = data[right];
                data[right] = temp;
            }
        }
        quick(data,start,right-1);
        quick(data,right+1,end);
    }
}
