package inflearn_lecture.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;

        List<String> solution = solution(n);

        System.out.println(solution);
    }

    private static List<String> solution(int n) {
        List<String> result = new ArrayList<>();
        dfs(result,"",n,n);
        return result;
    }

    private static void dfs(List<String> result, String str, int left, int right) {
        System.out.println("str = " + str + " left = " +  left + " right = " + right);

        if(left<0 || left>right) return ;

        if(left==0 && right==0){
            result.add(str);
        }

        dfs(result,str+"(",left-1,right);
        dfs(result,str+")",left,right-1);
    }
}
