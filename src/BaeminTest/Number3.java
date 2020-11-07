package BaeminTest;

public class Number3 {
    public static void main(String[] args) {
        String[] expected = {"H", "T", "H", "T", "H", "T", "H"};
        String[] actual = {"T", "T", "H", "H", "T", "T", "H"};

        int multiply = 1;

        int money = 1000;

        Solution a = new Solution();
        int result = a.solution(1000,expected,actual);

        System.out.println(result);

//        for (int i = 0; i < actual.length; i++) {
//            if (money <= 0) {
//                money=0;
//                break;
//            }
//
//            int battingMoney = 100*multiply;
//
//            if(money<battingMoney){
//                battingMoney=money;
//            }
//
//            if (expected[i] == actual[i]) {
//                money = money + battingMoney;
//                multiply = 1;
//            }
//            if (expected[i] != actual[i]) {
//                money = money - battingMoney;
//                multiply = multiply * 2;
//            }
//        }
//
//        System.out.println(money);

    }
    static class Solution {
        public int solution(int money, String[] expected, String[] actual) {

            int multiply = 1;

            for (int i = 0; i < actual.length; i++) {
                if (money <= 0) {
                    money=0;
                    break;
                }

                int battingMoney = 100*multiply;

                if(money<battingMoney){
                    battingMoney=money;
                }

                if (expected[i].equals(actual[i])) {
                    money = money + battingMoney;
                    multiply = 1;
                }
                if (!expected[i].equals(actual[i])) {
                    money = money - battingMoney;
                    multiply = multiply * 2;
                }
            }

            return money;

        }
        }
}
