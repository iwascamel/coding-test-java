package this_is_coding_test_book.realize;

import java.util.Scanner;

public class UpDownLeftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sizeString = sc.nextLine();
        Integer size = Integer.valueOf(sizeString);
        String s = sc.nextLine();

        System.out.println(size);
        System.out.println(s);

        String replace = s.replace(" ","");

        System.out.println(replace);
        int[] solution = solution(size, replace);
        System.out.println("x = " + solution[0] + " y = " + solution[1]);
    }

    private static int[] solution(int size, String s) {

        System.out.println(s);

        int x = 0;
        int y = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            switch (c){
                case 'U':
                if(y==0){
                    break;
                }else{
                    y--;
                }
                case 'D':
                    if(y==size-1){
                        break;
                    }else{
                        y++;
                    }
                case 'L':
                    if(x==0){
                        break;
                    }else{
                        x--;
                    }
                case 'R':
                    if(x==size-1){
                        break;
                    }else{
                        x++;
                    }
            }
        }
        int[] result = new int[2];
        result[0]=y+1;
        result[1]=x+1;
        return result;
    }
}
