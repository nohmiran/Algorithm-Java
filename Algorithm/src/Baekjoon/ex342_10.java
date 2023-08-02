package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ex342_10 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        BigInteger res = BigInteger.valueOf(N);
        for (int i = 1; i < N; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res.divide(BigInteger.valueOf(604800)));
    }
}
