package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class ex486_암호키 {

    public static void main(String[] args) {
        
        boolean[] flag = new boolean[1000001];
        ArrayList<Integer> v = new ArrayList<>();

        for (int i = 2; i < 1000001; i++) // 2부터 끝까지 소수로 가정
            flag[i] = true;

        for (int i = 0; i * i < 1000001; i++) {
            if (flag[i]) {
                for (int j = i * i; j < 1000001; j += i) // i의 제곱부터 i만큼 더하면 소수x
                    flag[j] = false;
            }
        }

        for (int i = 0; i < 1000001; i++) {
            if (flag[i]) // 소수 벡터에 넣기
                v.add(i);
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            long m = scanner.nextLong();
            boolean isPrime = true;

            for (int j : v) {
                if (m % j == 0) {
                    System.out.println("NO");
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("YES");
            }
        }
    }
}
