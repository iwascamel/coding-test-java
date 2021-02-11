package java_study.thread;

class Bank{
    int money=10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney(int money) throws InterruptedException {
            int m = getMoney();
            Thread.sleep(3000);
            setMoney(m+money);
    }

    public void minusMoney(int money) throws InterruptedException {
        int m = getMoney();
        Thread.sleep(200);
        setMoney(m-money);
    }
}

class Man extends Thread{
    public void run(){
        synchronized (SyncTest.kakaoBank){
            System.out.println("man's thread start");
            try {
                SyncTest.kakaoBank.saveMoney(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("after man : " + SyncTest.kakaoBank.getMoney());
        }
    }
}

class Wife extends Thread{
    public void run(){
        synchronized (SyncTest.kakaoBank) {
            System.out.println("wife's thread start");
            try {
                SyncTest.kakaoBank.minusMoney(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("after wife : " + SyncTest.kakaoBank.getMoney());
        }
    }
}

public class SyncTest {

    public static final Bank kakaoBank = new Bank();

    public static void main(String[] args) throws InterruptedException {


        Man man = new Man();
        man.start();

        Thread.sleep(200);
        Wife wife = new Wife();
        wife.start();
    }
}
