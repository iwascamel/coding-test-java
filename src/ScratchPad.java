public class ScratchPad {
    public static void main(String[] args) {
        String recursive = recursive(10);
//        System.out.println(recursive);
    }

    static String recursive(int n){

        if(n==1){
            System.out.println("1");
            return "1";
        }

        String result = recursive(n-1);
        System.out.println(result+n);
        return result+n;
    }
}

