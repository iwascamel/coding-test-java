package backjoon;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PrinterQueue {

    static class Node implements Comparable<Node>{
        Integer val;
        Integer index;

        @Override
        public int compareTo(Node o) {
            return o.val.compareTo(this.val);
        }
        Node(int val,int index){
            this.val=val;
            this.index=index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int m = sc.nextInt();
            int findNumber = sc.nextInt();

            Queue<Node> queue = new LinkedList<>();
            PriorityQueue<Node> pq = new PriorityQueue<>();
            Queue<Node> result = new LinkedList<>();

            for(int j=0;j<m;j++){
                int i1 = sc.nextInt();
                queue.offer(new Node(i1,j));
                pq.offer(new Node(i1,j));
            }

            while(!pq.isEmpty()){
                if(queue.peek().val.equals(pq.peek().val)){
                    result.offer(queue.poll());
                    pq.poll();
                }else{
                    Node poll = queue.poll();
                    queue.offer(poll);
                }
            }

            int count=0;
            while(!result.isEmpty()){
                Node poll = result.poll();
                count = count+1;
                if(poll.index==findNumber){
                    System.out.println(count);
                    count=0;
                    break;
                }
            }
        }
    }
}
