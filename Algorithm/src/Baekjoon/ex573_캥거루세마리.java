package Baekjoon;

import java.util.Scanner;

public class ex573_캥거루세마리 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        // 캥거루 초기 위치 a, b, c
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(Math.max((b - a - 1), (c - b - 1)));
	}
}
