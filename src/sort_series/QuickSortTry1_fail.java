package sort_series;

import java.util.Stack;

public class QuickSortTry1_fail {
    public static void main(String args[]){
        int[] data = {3,2,1,243,3212,5321,32,5,21};

        quick(data,0,data.length-1);

        for(int i:data){
            System.out.println(i);
        }
    }

    static void quick(int data[],int start,int end){
        if(start>=end){
            return;
        }
        int pivot=start;
        int left=start+1,right=end;
        Stack stackLeft=null,stackRight=null;
        int temp;

        while(left<right){
            for(int i=start;i<end;i++){
                if(data[pivot]<data[i] && !stackLeft.isEmpty()){
                    stackLeft.add(data[i]);
                    stackLeft.add(i);
                    left=i;
                }
            }
            for(int i=end;i>start;i--){
                if(data[pivot]>data[i] && !stackRight.isEmpty()){
                    stackRight.add(data[i]);
                    stackRight.add(i);
                    right=i;
                }
            }
            if(left>right){
                temp = data[left];
                data[left] = data[pivot];
                data[pivot] = temp;
                pivot = left;
            }else{
                temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            }
        }

        quick(data,start,pivot-1);
        quick(data,pivot+1,end);
    }


}
