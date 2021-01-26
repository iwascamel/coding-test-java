package sort_series;

public class BubbleSort {
    public static void main(String args[]){
        int data[] = {4,2,1,5,7,9,3,2,3,1,2,1,3,45,89};

        int result[] = bubble(data);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
    static int[] bubble(int data[]){
        int temp;
        for(int i=data.length;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }
}
