package Baekjoon;

import java.util.*;

public class ex450_만취한상범 {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int result = 0;

            for (int j = 1; j <= Math.pow(n, 0.5); j++) { // 1부터 n의 제곱근까지 반복
                if (j * j <= n) { // j의 제곱이 n 이하인 경우
                    result++; // result 증가
                }
            }
            System.out.println(result);
        }
    }
}
