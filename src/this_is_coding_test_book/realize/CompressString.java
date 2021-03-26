package this_is_coding_test_book.realize;

public class CompressString {
    public static void main(String[] args) {
        String s = "aabbaccc";

        solution(s);
    }

    private static void solution(String s) {
        int l = s.length();
//        for(int m=1;m<2/l;m++){
//
//        }
        int j=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l-1;i++){
            System.out.println("j = " + j + " i = "+ i);
            int count=0;
            if(s.charAt(i)!=s.charAt(i+1) || i+1==l-1){
                for(int k=j;k<i+1;k++){
                    count++;
                }
                if(count>1){
                    sb.append(count);
                }
                sb.append(s.charAt(j));
                j=i+1;
            }
            
        }
        System.out.println(sb.toString());
    }
}
