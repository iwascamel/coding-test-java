import java.util.Scanner;

public class BinarySearchRecursively {

    public boolean BinarySearch(int[] x, int a, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = (left + right) / 2;
        if (x[mid] == a) {
            return true;
        } else if (x[mid] < a) {
            return BinarySearch(x, a, mid + 1, right);
        } else if (x[mid] > a) {
            return BinarySearch(x, a, left, mid - 1);
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x[] = {2,4,5,6,7,8,9};
        int findInteger = sc.nextInt();
        BinarySearchRecursively binarySearchRecursively = new BinarySearchRecursively();
        binarySearchRecursively.BinarySearch(x,findInteger,0,6);
    }
}
