package ThisIsCodingTestBook.Greedy;

public class ForLoopExam {
    public static void main(String args[]){
        int[] data= {4,5,32,112,53,112,112};

        int result[] = loop(data);
        System.out.println(result[0] + " " + result[1]);
    }
    static int[] loop(int data[]){
        int count=0;
        int max=0;
        int next_max=0;
        int temp_count=0;
        int temp_array[] = new int[data.length];
        int result[] = new int[2];
        int temp[] = {222,222};

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
                return temp;
            }
            for(int j =0; j<data.length;j++){
                if(next_max <temp_array[j] && temp_array[j]>0){
                    next_max=temp_array[j];
                }
            }
        }
        result[0] = max;
        result[1] = next_max;
        return result;
    }

}
