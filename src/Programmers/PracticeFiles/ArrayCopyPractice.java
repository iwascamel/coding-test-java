package Programmers.PracticeFiles;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCopyPractice {
    public static void main(String[] args) {
        Integer[] intArray = {2,30,4,5,6,7};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(intArray));

        list.remove(30);

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
