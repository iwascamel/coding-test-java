package SortSeries;

public class SelectionSort2 {

    static int[] result(int data[]){
        int temp,min;

        for(int i=data.length;i>0;i--){
            for(int j=0;j<i;j++){
                min=data[i-1];
                if(data[j]>min){
                    temp=data[i-1];
                    data[i-1]=data[j];
                    data[j]=temp;
                }
            }
        }
        return data;
    }

    public static void main(String args[]){
            int[] data = {4,2,1,5,3,7,9,11,43,35};
            int[] returnData = result(data);
            for(int i : returnData){
                System.out.print(i+" ");
            }
    }
}
