import java.util.PriorityQueue;

public class ScratchPad {

    static class Node implements Comparable<Node>{
        Integer val;
        Integer index;

        Node(int val,int index){
            this.val=val;
            this.index=index;
        }

        @Override
        public int compareTo(Node o) {
            return o.val.compareTo(this.val);
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.offer(new Node(3,1));
        pq.offer(new Node(5,2));
        pq.offer(new Node(4,3));
        pq.offer(new Node(9,4));

        while(!pq.isEmpty()){
            System.out.println(pq.poll().index);
        }
    }

}


