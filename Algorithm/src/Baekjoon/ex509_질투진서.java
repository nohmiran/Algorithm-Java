package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex509_질투진서 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[2]);

        int[][] arr = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String[] rowInput = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(rowInput[j - 1]);
            }
        }

        int target = arr[x][y];
        boolean isAngry = false;

        for (int i = 1; i <= n; i++) {
            if (i != y && (arr[x][i] > target || arr[i][y] > target)) {
                isAngry = true;
                break;
            }
        }
        System.out.println(isAngry ? "ANGRY" : "HAPPY");
    }
}
