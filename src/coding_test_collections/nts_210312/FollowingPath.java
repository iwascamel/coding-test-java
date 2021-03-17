package coding_test_collections.nts_210312;

/*
유일하게 기억나는 문제

String 으로 # > < * 가 주어진다

#는 밑으로, >는 오른쪽, <는 왼쪽, *는 한번 만나면 밑, 두번째는 멈춘다.

ex)

String[] S = {"####","#><#","****","#*#*"}

####
#><#
****
#*#*

위는 4X4격자라고 볼 수 있다.

index 1234 부터 시작해서 아래로 떨어진다

밖으로 나가는 index 의 숫자는?

 */

import java.util.Scanner;

public class FollowingPath {
    public static void main(String[] args) {
        String s = "abcd";
        Scanner sc = new Scanner(System.in);

        String next = sc.next();

        char[] chars = next.toCharArray();

        char c = s.charAt(0);

        if(c==chars[0]){
            System.out.println("hi");
        }else{
            System.out.println("bye");
        }
    }
}
