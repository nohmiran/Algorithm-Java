package Baekjoon;

import java.util.Scanner;

public class ex88_별찍기6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = (2 * num) - (i * 2 - 1); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
