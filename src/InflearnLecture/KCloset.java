package InflearnLecture;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
문제 이해가 안돼서 패스
 */

public class KCloset {
    static Comparator<int[]> comp = new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return (o1[0]*o1[0]+o1[1]*o1[1])-(o2[0]*o2[0]+o2[1]*o2[1]);
        }
    };

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k=1;

        int result[][] = solve(points,k);
    }

    public static int[][] solve(int[][] points, int k) {
        Queue<int[]> queue = new PriorityQueue<>(points.length,comp);
        int[][] result = new int[k][2];
        int index = 0;

        return new int[0][];

    }

}
