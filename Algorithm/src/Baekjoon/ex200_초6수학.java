package Baekjoon;

import java.util.Scanner;

public class ex200_초6수학 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 0; i < test; ++i) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			int k = 0;

			for (int j = 1; j <= a && j <= b; j++) {
				if (a % j == 0 && b % j == 0) {
					k = j;
				}
			}
			System.out.print(a * b / k + " "); // 최소공배수
			System.out.println(k); // 최대공약수
		}

	}

}
