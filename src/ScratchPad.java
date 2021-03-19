public class ScratchPad {
    public static void main(String[] args) {
        String s = "2324233232";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(j==5){
                    i=7;
                }
                System.out.println("i = " + i);
                System.out.println("j = " + j);
            }
            System.out.println(" === ");
        }
    }
}


