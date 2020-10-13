package AlgorithmLecture;

public class InsertionSort {
    public void sort(int[] x) {
        int size = x.length;
        int temp;
        int j=0;
        for (int i = 0; i < 4; i++) {
            j = i;
            while (x[j] > x[j+1]) {
                temp = x[j];
                x[j]=x[j+1];
                x[j+1]=temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InsertionSort insertion = new InsertionSort();

        int a[] = {66, 10, 1, 34, 5,6};

        insertion.sort(a);
    }


}

