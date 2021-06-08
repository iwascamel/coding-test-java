package backjoon;

public class FindPrimeNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String next = sc.next();
//        String s = next.replace(" ","");

        boolean [] marked = new boolean[1000];
        marked[0]=true;
        marked[1]=true;

        for(var i=2;i<1000;i++){
            if(!marked[i]){
                for(int j=2*i;j<1000;j+=i){
                    marked[j]=true;
                }
            }
        }
        for(var i=1;i<1000;i++){
            if (!marked[i]){
                System.out.print(i + " ");
            }
        }
    }
}
