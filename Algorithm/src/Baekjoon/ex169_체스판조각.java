package Baekjoon;

import java.util.Scanner;

public class ex169_체스판조각 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 자를 수 있는 횟수
		int result = 1; // 최대 조각 수
		int a = 1; 

		for (int i = 0; i < num; i++) {

			if (i % 2 != 0) { // 짝수라면

				a += 1;
			}
			result += a; // 홀수라면
		}
		System.out.println(result);

	}

}
