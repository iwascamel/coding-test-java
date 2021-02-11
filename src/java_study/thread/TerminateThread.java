package java_study.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminateThread extends Thread {

    String word;
    boolean flag = false;

    public TerminateThread(String name,String word){
        super(name);
        this.word=word;
    }

    public void run(){
        try {
            while(!flag){
                sleep(1000);
                System.out.println(word);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TerminateThread t1 = new TerminateThread("A","A 입니다");
        TerminateThread t2 = new TerminateThread("B","B 입니다");

        t1.start();
        t2.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        while(true){
            if(s.equals("A")){
                t1.flag=true;
                t2.flag=true;
            }
        }
    }
}
