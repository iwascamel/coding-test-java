

public class ScratchPad {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] temp = arr;

        temp[2]=100;

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

