package this_is_coding_test_book.답안.구현;

import java.util.Scanner;

/*
input : a1
 */

public class KingOfNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int row = input.charAt(1)-'0';
        int column = input.charAt(0) -'a' +1;

        int[] dx = {-2,-2,2,2,-1,-1,1,1};
        int[] dy = {1,-1,-1,1,2,-2,2,-2};

        int result=0;
        for(int i=0;i<8;i++){

        }
    }
}
