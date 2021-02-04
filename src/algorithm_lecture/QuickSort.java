package algorithm_lecture;

public class QuickSort {

    public void quick(int data[],int start,int end){
        int temp;
        int i = start +1;
        int j = end;
        int key=0;

        while(i<=j){
            while(data[i]<data[key]){
                i++;
            }
            while(data[j]>data[key]){
                j--;
            }
            if(i>j){
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            }
            else {
                temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
        quick(data,start,j-1);
        quick(data,j+1,end);
    }

    public static void main(String args[]){
            int x[] = {4,7,1,2,9,5};
            QuickSort quickSort = new QuickSort();
            quickSort.quick(x,0,5);

            for(int a:x){
                System.out.println(a);
            }
    }
}
