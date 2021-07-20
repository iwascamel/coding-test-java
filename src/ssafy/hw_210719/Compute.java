package ssafy.hw_210719;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("곱 = " + num1 * num2);

        if( num1 > num2 ){
            System.out.println("몫 = " + num1 / num2);
        }else{
            System.out.println("몫 = " + num2/ num1);
        }

        String[] arr = {"ㅁㅁ","마연"};


    }
}
