package java_study.thread;

class B extends Thread{

    int start;
    int end;
    int sum;

     B(int start,int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        for(int i=start;i<end;i++){
            sum += i;
        }
    }

}

public class ThreadJoinPractice {
    public static void main(String[] args) throws InterruptedException {
        B t1 = new B(1,50);
        B t2 = new B(51,100);

        int sum=0;

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.sum);
        System.out.println(t2.sum);

        sum = t1.sum + t2.sum;

        System.out.println(sum);

    }
}
