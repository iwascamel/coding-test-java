package this_is_coding_test_book.data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        q.offer(5);
        q.offer(3);
        q.offer(4);

        q.poll();

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
