package ThisIsCodingTestBook.Greedy;

public class GreedyUntilOnePage99 {
    public static void main(String args[]) {

        int number=17;
        int count=0;
        int K=4;

        while(number !=1){
            if(number%K==0){
                number /= K;
            }else{
                number -= 1;
            }
            count++;
        }
        System.out.println(count);

    }
}
