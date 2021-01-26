package sort_series;

public class InsertionSort {
    public static void main(String args[]){
        int[] data = {4,642,1123,24,532,12,56,7};
        int[] result = insertDESC(data);

        for(int i : result){
            System.out.print(i + " ");
        }

    }
    static int[] insertDESC(int data[]){
        int temp;
        for(int i=0;i<data.length;i++){
            for(int j=0;j<i;j++){
                if(data[j]<data[j+1]){
                    temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        return data;
    }
    static int[] insertASC(int data[]){
        int temp;
        for(int i=0;i<data.length;i++){
            for(int j=i;j>0;j--){
                if(data[j]<data[j-1]){
                    temp = data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
        return data;
    }
}
