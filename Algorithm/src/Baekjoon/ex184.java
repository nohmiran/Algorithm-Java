package Baekjoon;

import java.util.Scanner;

public class ex184 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num == 4 || num == 7) {
			System.out.println(-1);
		} else if (num % 5 == 0) {
			System.out.println(num / 5);
		} else if (num % 5 == 1 || num % 5 == 3) {
			System.out.println((num / 5) + 1);
		} else if (num % 5 == 2 || num % 5 == 4) {
			System.out.println((num / 5) + 2);
		}
	}

}
