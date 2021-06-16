package the_coding_interview.chap1_string_and_array;

public class Num3ChangeBlankToPercent {
    public static void main(String[] args) {
        String s= "Mr John Smith";
        String solution = mySolution(s);
        System.out.println(solution);
    }
    public static String mySolution(String s){
        String[] sArray = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<sArray.length;i++){
            sb.append(sArray[i]);
            if(i!=sArray.length-1){
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
