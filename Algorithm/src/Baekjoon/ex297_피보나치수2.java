package Baekjoon;

import java.io.*;
import java.util.*;

public class ex297_피보나치수2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[91]; // 90번째 피보나치수는 int범위를 넘기 때문에 long으로
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2]; 
        }
        System.out.print(dp[n]);
    }
}
