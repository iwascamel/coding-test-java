

public class ScratchPad {
    public static void main(String[] args) {
        recursiveResult(15);
    }
    public static String recursiveString(int n){
        if (n==1) return "1";
        else return recursiveString(n-1)+n;
    }
    public static void recursiveResult(int n){
        if(n==0) return ;

        System.out.println(recursiveString(n));
        recursiveResult(n-1);
    }
}


