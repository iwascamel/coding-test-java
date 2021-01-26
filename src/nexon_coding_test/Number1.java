package nexon_coding_test;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        double floor = Math.floor(a + b);

        System.out.println((int)floor);
    }
}
