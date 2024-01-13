package Baekjoon;

import java.util.Scanner;

public class ex496_꼬리를무는숫자나열 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;

        int answer = 0;

        answer += Math.abs(a / 4 - b / 4);
        answer += Math.abs(a % 4 - b % 4);

        System.out.println(answer);
    }
}
