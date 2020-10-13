package AlgorithmLecture;

public class CountingSort {
    public int[] sort(int x[]){
        int count[] = new int[5];
        int data[] = new int[10];
        for(int i=0;i<10;i++){
            data[i]=x[i];
        }
        for(int i=0;i<10;i++){
            data[count[i]-1]++;
        }
        return data;
    }
    public static void main(String args[]){
            CountingSort countingSort = new CountingSort();
            int a[] = {4,2,3,4,5,1,1,1,2,2};
            int b[] = new int[10];
            for(int i=0;i<10;i++){
                b[i]=0;
            }
            a = countingSort.sort(a);
            for(int i=0;i<10;i++){
                System.out.println(b);
            }
    }
}
