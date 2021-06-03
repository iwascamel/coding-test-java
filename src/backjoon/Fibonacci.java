package backjoon;

public class Fibonacci {
    static int[] arr = new int[300];

    public static void main(String[] args) {
        int fibonacci = fibonacci(10);
        System.out.println(fibonacci);
    }
    static int fibonacci(int n){
        if(n<=2) {
            return 1;
        }
        else if(arr[n]==0){
            arr[n]=fibonacci(n-1)+fibonacci(n-2);
            return arr[n];
        }else{
            return arr[n];
        }
    }
}
