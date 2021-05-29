package back_gi_sun_al_lecture.structures;

public class QueueImplByArray {

    static final int MAX_SIZE = 5;
    int[] arr = new int[MAX_SIZE];
    int size = MAX_SIZE;
    int index = 0;

    void offer(int i){
        if(isOverQueueSize()){
            extendQueueSize();
        }
        arr[index++]=i;
    }
    boolean isOverQueueSize(){
        return index>size;
    }
    void extendQueueSize(){
        int[] temp = arr;
        size = MAX_SIZE*index;
        arr = new int[size];
        for(int i=0;i<index;i++){
            arr[i] = temp[i];
        }
    }
    int poll(){
        int result;
        result = arr[0];
        if(index==0){
            return -99999;
        }else if(index==1){
            return arr[--index];
        }else {
            for(int i=0;i<index-1;i++){
                arr[i]=arr[i+1];
            }
        }
        index--;
        return result;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<index;i++){
            sb.append(arr[i]);
            if(i!=index-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
