package ThisIsCodingTestBook.baeminTest;

public class Number2 {
    public static void main(String[] args) {

        String s = "987987";
        String op = "-";

        int result[] = new int[s.length()-1];


        for(int i=1;i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i,s.length());

            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);


            switch (op){
                case "+":
                    result[i-1]=i1+i2;
                    break;
                case "*":
                    result[i-1]=i1*i2;
                    break;
                case "-":
                    result[i-1]=i1-i2;
                    break;
            }
        }

        for(int i:result){
            System.out.println(i);
        }
    }
    class Solution {
        public long[] solution(String s, String op) {
            long result[] = new long[s.length()-1];


            for(int i=1;i<s.length();i++){
                String s1 = s.substring(0,i);
                String s2 = s.substring(i,s.length());

                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);


                switch (op){
                    case "+":
                        result[i-1]= Long.valueOf(i1+i2);
                        break;
                    case "*":
                        result[i-1]= Long.valueOf(i1*i2);
                        break;
                    case "-":
                        result[i-1]= Long.valueOf(i1-i2);
                        break;
                }
            }

          return result;
        }
    }
}
