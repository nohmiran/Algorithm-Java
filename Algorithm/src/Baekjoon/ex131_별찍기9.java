package Baekjoon;

import java.util.Scanner;

public class ex131_별찍기9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		// 역삼각형
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = num * 2 - i; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
		// 삼각형
		for (int i = 1; i <= num - 1; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
