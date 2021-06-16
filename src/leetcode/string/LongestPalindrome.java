package leetcode.string;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "123454327";
        String s2 = "122134567";
        System.out.println(solution(s2));
    }
    public static String solution(String s){
        String result= "";

        for(int i=0;i<s.length()-1;i++){
            String twoPointer = expand(i,i+1,s);
            String threePointer = expand(i,i+2,s);
            String temp="";

            if(twoPointer.length()>threePointer.length()){
                temp = twoPointer;
            }else{
                temp = threePointer;
            }
            if(result.length() <=temp.length()){
                result = temp;
            }
        }
        return result;
    }
    public static String expand(int left,int right,String s){
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return s.substring(left+1,right);
    }
}
