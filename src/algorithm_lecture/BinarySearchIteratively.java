package algorithm_lecture;

import java.util.Scanner;

public class BinarySearchIteratively {
    public boolean BinarySearch(int[] x, int a) {
        int left = 0;
        int right = x.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a == x[mid]) {
                return true;
            } else if (a > x[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x[] = {2, 4, 5, 6, 7, 8, 9};
        int findInteger = sc.nextInt();
        BinarySearchRecursively binarySearchRecursively = new BinarySearchRecursively();
        binarySearchRecursively.BinarySearch(x, findInteger, 0, 6);
    }
}

