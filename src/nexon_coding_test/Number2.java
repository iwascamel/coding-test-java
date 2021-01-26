package nexon_coding_test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Number2 {
    public static void main(String[] args) throws IOException {
        Result3 a = new Result3();

        List<Integer> px1 = new ArrayList<>();
        px1.add(7);
        px1.add(1);
        px1.add(2);
        px1.add(5);

        List<Integer> px2 = new ArrayList<>();
        px2.add(7);
        px2.add(5);
        px2.add(3);
        px2.add(1);

        List<Integer> px3 = new ArrayList<>();
        px3.add(7);
        px3.add(2);
        px3.add(3);
        px3.add(10);
        px3.add(2);
        px3.add(4);
        px3.add(8);
        px3.add(1);

        System.out.println(a.maxDifference(px3));
    }

}

class Result3 {

    public int maxDifference(List<Integer> px) {
        int max=0;
        int compare=0;

        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<px.size();i++){
            stack.push(px.get(i));
        }
        for(int j=1;j<px.size();j++){
            Integer firstPop = stack.pop();
            for(int i=0;i<px.size()-j;i++){
                int secondPop = stack.pop();
                if(firstPop>secondPop){
                    compare=firstPop-secondPop;
                    max=Math.max(compare,max);
                }
            }
            for(int k=0;k<px.size()-j;k++){
                stack.push(px.get(k));
            }
        }
        if(max==0) max=-1;
        return max;
    }

}