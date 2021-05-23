package coding_test_collections.naver_webtoon_ready;

/*
2018년 기출:

재귀로 호출하기

12345689
...
123
12
1
 */

public class Recursion {
    public static void main(String[] args) {
//        recurse_straight(15);
        recurse_reverse(20);
    }
    static String recurse_straight(int n){
        if(n==1){
            return "1";
        }
        return recurse_straight(n-1)+n;
    }
    static int recurse_reverse(int n){

        if(n==1) {
            System.out.println("1");
            return 1;
        }
        String s = recurse_straight(n);
        System.out.println(s);
        return recurse_reverse(n-1);
    }
}

