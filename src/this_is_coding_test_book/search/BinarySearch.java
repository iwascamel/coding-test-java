package this_is_coding_test_book.search;

import java.util.Comparator;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {2, 4, 5, 7, 9, 11, 15};

        int x = 11;

        int result = binary(array, x, 0, array.length - 1);
        System.out.println(result);
    }

    private static int binary(int[] array, int find, int start, int end) {

        if (start > end) return -1;

        int middle = (start + end) / 2;

        if (array[middle] == find) {
            return middle;
        } else if (array[middle] > find) {
             return binary(array, find, start,middle-1);
        } else {
             return binary(array, find, middle+1, end);
        }

    }
}
