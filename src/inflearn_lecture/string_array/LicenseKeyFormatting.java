package inflearn_lecture.string_array;

/*
   String str= "8F3Z-2e9-w"
   String str2 = "8-5g-3-j"

   이런식으로 주어질 때
   뒤에서 4자리를 끊고, 대문자로 합친 문자열을 만들어라

   String str = "8F3Z-2E9W"
   String str2 = "8-5G3J"

   String,StringBuffer,StringBuilder
 */

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String str = "8F3Z-2e-9-wadwqdas";
        String str2= "8-5g-3-j";
        int k=4;
        String solution = solution(str, k);
    }

    private static String solution(String str, int k) {
        String replace = str.replace("-", "");
        String s = replace.toUpperCase();

        int length = replace.length();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            sb.append(s.charAt(i));
        }

        for(int i=k;i<length;i=i+k){
            System.out.println(length-i);
            sb.insert(length-i,"-");
        }
        System.out.println(sb);

        return s;
    }
}
