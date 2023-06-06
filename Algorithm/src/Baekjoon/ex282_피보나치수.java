package Baekjoon;

import java.io.*;
import java.util.*;

public class ex282_피보나치수 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[46];  // 46인 int형 배열 dp를 만들어줌
        dp[1] = 1; // dp[1]은 1로 초기화
        
        for (int i = 2; i <= num; i++) {
            // 피보나치 공식
            // fib(n) = fib(n - 1) + fib(n - 2)
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.print(dp[num]);
    }
}
