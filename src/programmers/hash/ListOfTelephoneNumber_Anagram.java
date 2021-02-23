package programmers.hash;

import java.util.Arrays;

public class ListOfTelephoneNumber_Anagram {
    public static void main(String[] args) {
        String[] data = {"119","97674223","1195524421"};
        String[] data2 = {"12","123","1235","567","88"};
        String[] data3= {"123","456","789"};

        boolean solution = solution(data3);
        System.out.println(solution);
    }

    private static boolean solution(String[] phone_book) {

        boolean result = true;

        for(int i=0;i<phone_book.length;i++){
            int[] anagram = new int[256];

            for(int j=0;j<phone_book[i].length();j++){
                anagram[phone_book[i].charAt(j)]++;
            }

            for(int k=i+1;k< phone_book.length;k++){
                int[] anagramJ = new int[256];
                if(phone_book[i].length()<=phone_book[k].length()){
                    String substringJ = phone_book[k].substring(0, phone_book[i].length());

                    for(int a=0;a<substringJ.length();a++){
                        anagramJ[substringJ.charAt(a)]++;
                    }

                    if(Arrays.equals(anagram, anagramJ)) result=false;
                }
            }
        }
        return result;
    }
}
