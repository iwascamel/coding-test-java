package ThisIsCodingTestBook.baeminTest;

public class Number5 {
    public static void main(String[] args) {
        String penter = "1100";
        String pexit = "0010";
        String pescape = "1001";
        String data = "1101" +
                "1001" +
                "0010" +
                "1111" +
                "0011" +
                "1100" +
                "0000";

        int size = data.length()/penter.length();

        String[] splitData = new String[size];

        for(int i=0;i<size;i++){
            splitData[i] = data.substring(i*penter.length(),i*penter.length()+penter.length());
        }

        for(int i=0;i<splitData.length;i++){
            if(splitData[i].equals(penter) || splitData[i].equals(pexit) || splitData[i].equals(pescape)){
                splitData[i] = pescape+splitData[i];
            }
        }

        String newData = "";

        for(String i : splitData){
            newData += i;
        }

        newData = penter + newData + pexit;

        System.out.println(newData);



    }
}
class Solution {
    public String solution(String penter, String pexit, String pescape, String data) {
        int size = data.length()/penter.length();

        String[] splitData = new String[size];

        for(int i=0;i<size;i++){
            splitData[i] = data.substring(i*penter.length(),i*penter.length()+penter.length());
        }

        for(int i=0;i<splitData.length;i++){
            if(splitData[i].equals(penter) || splitData[i].equals(pexit) || splitData[i].equals(pescape)){
                splitData[i] = pescape+splitData[i];
            }
        }

        String newData = "";

        for(String i : splitData){
            newData += i;
        }

        newData = penter + newData + pexit;

       return newData;

    }
}

