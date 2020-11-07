package BaeminTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String [] array = s.split("]");

        String firstString = array[0] + "]";

        String firstStringArray = array[0].substring(1, array[0].length()-1);

        System.out.println(firstStringArray);

        System.out.println("=======");

        String[] firstSplit = firstStringArray.split(",");

        for(String i : firstSplit){
            System.out.println(i);
        }

        System.out.println("=======");


        String secondString = array[1].substring(1, array[1].length());

        String[] secondSplit = secondString.split(",");

        int[] secondSplitArray = new int[secondSplit.length];

        for(int i=0;i<secondSplit.length;i++){
            secondSplitArray[i]= Integer.parseInt(secondSplit[i]);
        }

        for(int i:secondSplitArray){
            System.out.println(i);
        }

        System.out.println("=======");

        System.out.println(array[2]);
    }
}
