package ThisIsCodingTestBook.Greedy;

public class GreedyLawOfGreatNumbersPage92 {
    public static void main(String args[]){
        int[] data = {2,4,5,4,6};

        System.out.println(findResult(data,8,3));

    }
    static int findResult(int data[], int m, int k){
        int count=0;
        int max=0;
        int next_max=0;
        int temp_count=0;
        int temp_array[] = new int[data.length];
        int result=0;

        // 최대값 찾기
        for(int i =0; i<data.length;i++){
            if(max<data[i]){
                max=data[i];
            }
        }
        // 두번째 최대값 찾기
        for(int i =0; i<data.length;i++){
            temp_array[i]=data[i];
            if(temp_array[i]==max){
                temp_array[i]=-1;
                temp_count++;
            }
            if(temp_count>=2){
                return max*m;
            }
            for(int j =0; j<data.length;j++){
                if(next_max <temp_array[j] && temp_array[j]>0){
                    next_max=temp_array[j];
                }
            }
        }

        while(count<m){
            for(int i=0;i<k;i++){
                if(count==m) break;
                result = result + max;
                count++;
            }
            result=result+next_max;
            count++;
        }
        return result;
    }
}
