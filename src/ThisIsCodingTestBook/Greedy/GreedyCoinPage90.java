package ThisIsCodingTestBook.Greedy;

public class GreedyCoinPage90 {

    public static void main(String args[]){
        int n = 1260;
        int count =0;
        int coins[] = {500,100,50,10};

        for(int i : coins){
            count += n/i;
            n %= i;
        }
        System.out.println(count);
    }
}
