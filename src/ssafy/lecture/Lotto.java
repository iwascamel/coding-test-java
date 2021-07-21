package ssafy.lecture;

public class Lotto {
    int[] lots;
    int n;
    int m;

    public Lotto(int n,int m){
        super();

        this.n = n;
        this.m = m;

        lots = new int[this.n];

        make();
    }
    public void make(){
        int count= 0 ;
        while (count != n) {
            int number = (int) (Math.random() * m) +1;
            if(!contains(number)){
                lots[count++] = number;
            }
        }
    }
    public boolean contains(int targetNumber){
        for(int i=0;i<n;i++){
            if(lots[i] == targetNumber){
                return true;
            }
        }
        return false;
    }

    public Lotto(){
        this(6,45);
    }

    public void print(){
        for (int i=0;i<n;i++){
            System.out.print(lots[i]);
            System.out.println();
        }
    }

}
