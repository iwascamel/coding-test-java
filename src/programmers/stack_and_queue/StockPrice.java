package programmers.stack_and_queue;

import java.util.Stack;

public class StockPrice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        int prices[] = {1,6,4,5,7,6,2,3};

        int result[] = new int[prices.length];

        for(int i=0;i<prices.length;i++){
            for(int k:prices){
                stack.push(k);
            }
            int count=0;
            for(int j= prices.length-i-1;j>0;j--){
                if(prices[i]<=stack.pop()){
                    count++;
                }
            }
            result[i]=count;
            stack.clear();
        }

        for(int i:result){
            System.out.println(i);
        }

    }
}
