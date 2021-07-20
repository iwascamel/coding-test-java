package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int loopCount =Integer.parseInt(n);

        for (int i=0;i<loopCount;i++){
            int arrSize = Integer.parseInt(br.readLine());
            char[][] arr = new char[arrSize][arrSize];

            char[] temp ;
            for (int j=0;j<arrSize;j++){
                temp = br.readLine().replace(" ","").toCharArray();
                arr[j] = temp.clone();
            }

            // 루프 돌면서 G에 대한 확인. 만약 팔방면에 G가 없다면, 세로 쭉, 가로 쭉 해서 B의 갯수 세기.
            // 아닐 경우 2 반환
            for(int k=0;k<arrSize;k++){

            }
        }
    }

    static void print(char[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    static boolean inRange(int nx,int ny,int length){
        if( nx>=0 && nx < length && ny>=0 && ny<length){
            return true;
        }else{
            return false;
        }
    }
    static boolean search(char[][] arr,int i,int j){
        int[] dx = {-1,-1,0,1,1,1,0,-1};
        int[] dy = {0,1,1,1,0,-1,-1,-1};

        for(int k=0;k<8;k++){
            if(inRange(i+dx[k],j+dy[k],arr.length)){
                if( arr[i+dx[k]][j+dy[k]] == 'G'){
                    return false;
                }
            }
        }
        return true;
    }
}