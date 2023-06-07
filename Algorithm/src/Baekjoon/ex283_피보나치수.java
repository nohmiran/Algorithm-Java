package Baekjoon;

import java.io. *;
import java.math.*;
import java.util. *;

public class ex283_피보나치수 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[num + 1];
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        
        if (num >= 2) {
            dp[2] = BigInteger.ONE;
        }
        for (int i = 3; i <= num; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]); // 피보나치 수
        }
        System.out.println(dp[num]);
    }
}
