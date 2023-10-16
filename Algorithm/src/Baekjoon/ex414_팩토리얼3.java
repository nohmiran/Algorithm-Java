package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ex414_팩토리얼3 {
  
    public static void main(String[] args) throws IOException {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger result = karatsubaFactorial(BigInteger.ONE, BigInteger.valueOf(N));
        System.out.println(result);
    }

    // 카라츠바 곱셈을 사용한 팩토리얼 계산
    public static BigInteger karatsubaFactorial(BigInteger start, BigInteger end) {
        if (start.compareTo(end) > 0) {
            return BigInteger.ONE;
        } else if (start.compareTo(end) == 0) {
            return start;
        } else {
            BigInteger mid = start.add(end).divide(BigInteger.valueOf(2));
            BigInteger left = karatsubaFactorial(start, mid);
            BigInteger right = karatsubaFactorial(mid.add(BigInteger.ONE), end);
            return left.multiply(right);
        }
    }
}
