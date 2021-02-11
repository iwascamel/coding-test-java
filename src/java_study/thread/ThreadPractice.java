package java_study.thread;

public class ThreadPractice {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println(Thread.currentThread());

        String threadName = Thread.currentThread().getName();
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

        System.out.println(threadName);
        System.out.println(threadGroup.getName());

//        System.out.println("finish");
    }
}

class A implements Runnable{
    @Override
    public void run() {
        int i;

        for(i=0;i<50;i++){
//            System.out.print(i + "\t");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
