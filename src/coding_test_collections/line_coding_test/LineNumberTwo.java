package coding_test_collections.line_coding_test;

import java.util.Stack;

public class LineNumberTwo {
    public static void main(String args[]) {

    }
}

class Solution {
    public int[] solution(int[] ball, int[] order) {

        Stack<Integer> stack = new Stack();
        Stack<Integer> tempStack = new Stack();

        int[] answer = {};

        for (int i = 0; i < ball.length; i++) {
            stack.add(ball[i]);
        }

        for (int i = 0; i < stack.size(); i++) {
            for (int j = 0; j < order.length; j++) {
                if (stack.get(j) == order[i]) {
                    int index = j;

                    if(index==0 || index == stack.size()-1){
                        if(tempStack.isEmpty()){
                           answer[j]=stack.get(index);
                        }else{
                            int temp=0;

                        }
                    }else{
                        tempStack.push(ball[i]);
                    }
                }
            }
        }


//        for(int i=0;i<ball.length;i++){
//            for (int j=0;j<ball.length;j++){
//                if(ball[j]==order[i]){
//                    int index=j;
//
//                }
//            }
//        }
        // order[0]

        return answer;
    }
}
