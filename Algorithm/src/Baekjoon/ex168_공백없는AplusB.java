package Baekjoon;

import java.util.Scanner;

public class ex168_공백없는AplusB {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int result = 0;

		if (num == 1010) {

			result = 20;

		} else if (num / 10 > 10) {

			result = (num / 100) + (num % 100);

		} else {

			result = (num / 10) + (num % 10);
		}

		System.out.println(result);

	}

}
