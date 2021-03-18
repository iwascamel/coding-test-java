package this_is_coding_test_book.dp;

public class Fibonacci {
    public static void main(String[] args) {
        int N = 5;
        int[] memory = new int[999];

        int i = topDown(N,memory);
        System.out.println(i);

        int i1 = bottomUp(N);
        System.out.println(i1);
    }

    private static int bottomUp(int n) {
        int[] m = new int[999];

        m[1]=1;
        m[2]=1;

        for(int i=3;i<n+1;i++){
            m[i]=m[i-1]+m[i-2];
        }
        return m[n];
    }

    private static int topDown(int n,int[] memory) {

        if(n==1) return 1;
        if(n==2) return 1;

        if(memory[n]==0){
            return memory[n]= topDown(n-1,memory)+topDown(n-2,memory);
        }else{
            return memory[n];
        }
    }
}
