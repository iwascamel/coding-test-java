package sort_series;

public class SelectionSortTry_fail {

    static int[] result(int[] data){
        int temp;
        int minIndex;

        for(int i=0;i<data.length;i++){
            minIndex=i;
            // 일단 for loop의 범위를 잘못잡음 10,9,8,7 이렇게 가야하는데 1,2,3,4,5 이렇게 가고있음
            // j가 i부터 i+1까지..? 한번만 돌겠다는 것...
                for(int j=i;j<i+1;j++){
                    int min=9999;
                    if(data[j]<min){
                        min=data[j];
                        minIndex=j;
                        temp=data[i];
                        data[i]=data[j];
                        data[j]=temp;
                    }
            }
        }
        return data;
    }

    public static void main(String args[]){
        int[] data = {3,4,2,1,5,7,8};
        int[] returnData = result(data);
        for(int i : returnData){
            System.out.print(i);
        }
    }
}
