package programmers.practice_files;

public class BreakLoop {
    public static void main(String[] args) {
        loop:
        for(int i=0;i<3;i++){
            System.out.println("i출력 : " + i);
            for(int j=0;j<3;j++){
                System.out.println("j출력 : " + j + "  "+ "이떄의 i : " + i);
                if(j==1){
                    return ;
                }
            }
        }
        System.out.println("done");
    }
}
