package Baekjoon;

import java.util.Scanner;

public class ex270_레몬따기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int max = 0;

		for (int i = 1; i <= num; i++) {

			int curr = sc.nextInt() - (num + 1 - i);

			if (curr > max)
				max = curr;
		}
		System.out.println(max);
	}
}
