package AlgorithmLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DpCoin {
    public static void main(String args[]) throws IOException {
        int coin[] = new int[1000];
        int d[] = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String m = br.readLine();

        String[] array = s.split(", ");

        int n = array.length;

        for(int i=0;i<n;i++){
            coin[i] = Integer.parseInt(array[i]);
        }

        int k = Integer.parseInt(m);

//        int n, k;
//
//        n = sc.nextInt();
//        k = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            coin[i] = sc.nextInt();
//        }

        for (int i = 1; i <= k; i++) {
            d[i] = -1;
            for (int j = 0; j < n; j++) {
                if (coin[j] <= i) {
                    if (d[i - coin[j]] < 0) continue;
                    if (d[i] < 0) d[i] = d[i - coin[j]] + 1;
                    else if (d[i - coin[j]] + 1 < d[i]) d[i] = d[i - coin[j]] + 1;
                }
            }
        }

        System.out.println(d[k]);
    }
}
