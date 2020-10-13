package CodingTest;

public class QuickSort {

    static void quick(int[] data,int start,int end){
        if (start >= end) {
            return;
        }
        int pivot = start;
        int left,right;
        int temp;

        left=start+1;
        right=end;

        while(left<=right){
            while(data[pivot]>=data[left]){
                left++;
            }
            while(data[pivot]<=data[right] && right>start){
                right--;
            }
            if(left<right){
                temp = data[left];
                data[left]=data[right];
                data[right]=temp;
            }else{
                temp = data[pivot];
                data[pivot]=data[right];
                data[right]=temp;
            }
        }

        quick(data,start,right-1);
        quick(data,right+1,end);

    }

    public static void main(String args[]){
            int[] data = {3,4,21,112,53,6,7,};

            quick(data,0,6);

            for(int i:data){
                System.out.println(i);
            }
    }
}
