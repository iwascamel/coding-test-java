public class SelectionSortPractice {


    public void sort(int x[]){
        int temp;
        int max = x.length;
        int min;

        for(int i=0;i<max-1;i++){
            min=i;

            for(int j=i+1;j<max;j++){
                if(x[min]>x[j]){
                    min=j;
                }
            }
            temp = x[i];
            x[i] = x[min];
            x[min] = temp;
        }
    }
    public static void main(String args[]){
        int x[] = {34,56,32,1,10};
        SelectionSortPractice selectionSortPractice = new SelectionSortPractice();
        selectionSortPractice.sort(x);


        for(int a : x){
            System.out.println(a);
        }
    }
}
