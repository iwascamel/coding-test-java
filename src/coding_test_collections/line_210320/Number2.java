package coding_test_collections.line_210320;

/*
21-03-20

비밀번호 반환
 */

import java.util.*;

public class Number2 {
    public static void main(String[] args) {
        String s = "aaaaZZZZ)";

        int[] solution = solution(s);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    private static int[] solution(String inp_str) {
        Set<Integer> result = new HashSet<>();

        // 1번
        if(inp_str.length()<8 || inp_str.length()>15){
            result.add(1);
        }

        // 2번
        if(inp_str.contains("(") || inp_str.contains(")") || inp_str.contains("-") || inp_str.contains("=")
        || inp_str.contains("_") || inp_str.contains("+")){
            result.add(2);
        }
        int[] check = new int[256];
        for(int i=0;i<inp_str.length();i++){
            check[inp_str.charAt(i)]++;
        }
        int checking=0;
        for(int i=0;i<check.length;i++){
            checking += check[i];
        }
        if(checking!=inp_str.length()){
            result.add(2);
        }

        // 3번
        Set<Integer> set = new HashSet<>();

        // 숫자 1
        for(int i=48; i<58;i++){
            if(check[i]!=0) set.add(1);
        }

        // 소문자 2
        for(int i=65;i<91;i++){
            if(check[i]!=0) set.add(2);
        }

        // 대문자
        for(int i=97;i<123;i++){
            if(check[i]!=0) set.add(3);
        }

        // 특수문자
        if(inp_str.contains("~") || inp_str.contains("!") || inp_str.contains("@") || inp_str.contains("$")
                || inp_str.contains("%") || inp_str.contains("^") || inp_str.contains("&") || inp_str.contains("*")){
            set.add(4);
        }

        if(set.size()<3){
            result.add(3);
        }

        // 4번

        int count=0;

        for(int i=0;i<inp_str.length()-1;i++){
            if(inp_str.charAt(i)==inp_str.charAt(i+1)){
                count++;
                if(count>=3) break;
            }else{
                count=0;
            }
        }
        if(count>=3) result.add(4);

        for(int i=0;i<check.length;i++){
            if(check[i]>=5){
                result.add(5);
            }
        }

        if(result.size()<=0){
            return new int[1];
        }

        int[] r = new int[result.size()];

        List<Integer> list = new ArrayList<>(result);

        for(int i=0;i<r.length;i++){
            r[i]=list.get(i);
        }

        Arrays.sort(r);

        return r;
    }
}
