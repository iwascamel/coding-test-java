package inflearn_lecture.structures;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[]{3,4};

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(ints);

        int[] poll = queue.poll();
        for (int i : poll) {
            System.out.println(i);
        }
    }
}
