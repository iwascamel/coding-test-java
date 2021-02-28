package t_academy_lecture.sort;

/*
21-02-27
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,21,5,66,11,1,3};

        int[] selection = selection(array);
        for (int i : selection) {
            System.out.println(i);
        }
    }

    private static int[] selection(int[] array) {
        int temp;

        for(int i=0;i< array.length;i++){
            int min=i;
            for(int j=i+1;j< array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
                temp=array[i];
                array[i]=array[min];
                array[min]=temp;
        }
        return array;
    }
}
