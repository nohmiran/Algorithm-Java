package Baekjoon;

import java.util.Scanner;

public class ex023_구구단 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}
}
