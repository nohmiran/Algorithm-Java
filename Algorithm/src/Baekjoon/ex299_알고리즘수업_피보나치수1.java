package Baekjoon;

import java.util.*;

public class ex299_알고리즘수업_피보나치수1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[41];
        dp[1] = 1;
        dp[2] = 1;
        int n = sc.nextInt();
        int result2 = n - 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print(dp[n] + " " + result2);
    }
}
