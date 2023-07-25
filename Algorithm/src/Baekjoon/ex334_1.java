package Baekjoon;

import java.util.Scanner;

public class ex334_1 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        // 각 자릿수가 모두 1로만 이루어진 n의 배수를 찾자.
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = 0;

            for (int i = 1; i <= n; i++) {
                num = (num * 10 + 1) % n;

                if (num == 0) {
                    System.out.println(i); // 가장 작은 수의 자리수
                    break;
                }
            }
        }
    }
}
