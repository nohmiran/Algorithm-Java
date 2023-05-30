package Baekjoon;

import java.util.Scanner;

public class ex278_이항계수1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = 1;
        for (int i = 1; i <= num1; i++) {
            answer *= i;
        }
        for (int i = 1; i <= num2; i++) {
            answer /= i;
        }
        for (int i = 1; i <= num1 - num2; i++) {
            answer /= i;
        }
        System.out.println(answer);
    }
}
