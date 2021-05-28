package back_gi_sun_al_lecture.structures;

public class StackImpl {

    private static final int STACK_SIZE = 3;
    private int[] arr = new int[STACK_SIZE];
    private int size = STACK_SIZE;
    private int index = 0;

    StackImpl(){
    }

    public void push(int data){
        if(isOverStackSize()){
            extendStackSize();
        }
        arr[index++] = data;
    }
    private boolean isOverStackSize(){
        return index >= size;
    }
    private void extendStackSize(){
        int[] tempArr = arr;
        size = index*STACK_SIZE;
        arr = new int[size];
        for(int i=0;i<tempArr.length;i++){
            arr[i]=tempArr[i];
        }
    }

    public int pop() throws Exception {
        if(index==0){
            throw new Exception("에러");
        }
        return arr[index--];
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i =0;i<index;i++){
            sb.append(arr[i]);
            if(i!=index-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
