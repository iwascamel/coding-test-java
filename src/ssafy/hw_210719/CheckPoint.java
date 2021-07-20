package ssafy.hw_210719;

import java.util.Scanner;

public class CheckPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();

        int degree = weight-height+100;
        System.out.println("비만수치는 " + degree + "입니다");

        if( degree > 0 ){
            System.out.println("당신은 비만이군요");
        }
    }
}
