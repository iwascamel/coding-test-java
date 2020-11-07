package ThisIsCodingTestBook.baeminTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String [] array = s.split("]");

        String firstString = array[0] + "]";

        String firstStringArray = array[0].substring(1, array[0].length()-1);

        String[] firstSplit = firstStringArray.split(",");

        String secondString = array[1].substring(1, array[1].length());

        String[] secondSplit = secondString.split(",");

        int[] secondSplitArray = new int[secondSplit.length];

        for(int i=0;i<secondSplit.length;i++){
            secondSplitArray[i]= Integer.parseInt(secondSplit[i]);
        }

        int testInt[] = new int[firstSplit.length];

            for(int i=0;i< firstSplit.length;i++){
                switch (firstSplit[i]){
                    case "A+": testInt[i]=10;
                          break;
                    case "A0": testInt[i]=9;
                          break;
                    case "B+": testInt[i]=8;
                        break;
                    case "B0": testInt[i]=7;
                       break;
                    case "C+": testInt[i]=6;
                       break;
                    case "C0": testInt[i]=5;
                        break;
                    case "D+": testInt[i]=4;
                        break;
                    case "D0": testInt[i]=3;
                        break;
                    case "F": testInt[i]=0;
                        break;
                }
            }

            int[] result = new int[secondSplitArray.length];

            for(int i=0;i<secondSplitArray.length;i++){
                result[i] = secondSplitArray[i]*testInt[i];
            }

            int resultValue =0;

            for(int i:result){
                resultValue+=i;
            }

            int threshold = Integer.parseInt(array[2]);

        System.out.println(resultValue-threshold);

    }
}
