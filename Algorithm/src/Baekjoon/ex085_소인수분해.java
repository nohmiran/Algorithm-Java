package Baekjoon;

import java.util.Scanner;

public class ex085_소인수분해 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {

			while (n % i == 0) {

				System.out.println(i);

				n /= i;
			}
		}
	}

}
