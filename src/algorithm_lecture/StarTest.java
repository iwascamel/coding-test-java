package algorithm_lecture;

import java.util.Scanner;

public class StarTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

//        for(;N>0;N--){
//            for(int j=N-1;j>0;j--){
//                System.out.print(" ");
//            }
//            for(int i=0;i<=N/2+1;i++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for(int j=1;j<N+1;j++){
//            for(int k=N-j;k>0;k--){
//                System.out.print(" ");
//            }
//            for(int i=0;i<j;i++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for(int j=1;j<N+1;j++){
//            for(int i=N;i>0;i--){
//                if(i>j){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println(" ");
//        }

//        for(int j=0;j<N;j++){
//            for(int k=N-1-j;k>0;k--){
//                System.out.print(" ");
//            }
//            for(int i=0;i<2*j+1;i++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for(int j=0;j<N-3;j++){
//            for(int k=N/2-j+N;k>0;k--){
//                System.out.print(" ");
//            }
//            for(int i=0;i<2*j+1;i++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for(int j=0;j<N/2;j++){
//            for(int k=0;k<j-1+N;k++){
//                System.out.print(" ");
//            }
//            for(int i=N+2-2*j;i>0;i--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        for(int j=0;j<N/2+1;j++){
            for(int k=N/2-j;k>=0;k--){
                System.out.print(" ");
            }
            for(int i=0;i<2*j+1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int j=0;j<N/2;j++){
            for(int k=0;k<j+2;k++){
                System.out.print(" ");
            }
            for(int i=N-2-2*j;i>0;i--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
