package engineer_korea_lecture.string;

/*
21-03-27
 */

public class CompressString {
    public static void main(String[] args) {
        String str = "aabbaccc";
        String newStr = compress(str);
        String result = str.length() < newStr.length() ? str : newStr;

        System.out.println(result);
    }

    private static String compress(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder(getTotal(str));
        for(int i=0;i<str.length();i++){
            count++;
            // 다를 때 i+1 >= str.length() 하면 된다...
            if( i+1>=str.length() || str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(count);
                count=0;
            }
        }
        return sb.toString();
    }

    private static int getTotal(String str) {
        int count=0;
        int total=0;
        for(int i=0;i<str.length();i++){
            count++;
            if(i+1>=str.length() || str.charAt(i) != str.charAt(i+1)){
               total += 1+ String.valueOf(count).length();
               count=0;
            }
        }
        return total;
    }
}
