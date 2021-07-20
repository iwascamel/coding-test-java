package ssafy;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []arr = new int[10];
        while(true) {
            int n = scan.nextInt();
            if(n==0) {
                break;
            }
            int n2 = (n/10)%10;
            for(int i=0;i<10;i++) {
                if(n2==i) {
                    arr[i]++;
                }
            }
        }
        for(int i=0;i<10;i++) {
            if(arr[i]!=0) {
                System.out.printf("%d : %d개", i, arr[i]);
                System.out.println();
            }
        }

    }

}
