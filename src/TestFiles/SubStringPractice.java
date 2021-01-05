package TestFiles;

public class SubStringPractice {
    public static void main(String[] args) {
        String str1 = "012 345 678 9";

       String[] str2= str1.split(" ");

       for(String s : str2){
           System.out.println(s);
       }
    }
}
