package Baekjoon;

import java.util.Scanner;

public class ex136_사파리월드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();

		long result;

		result = Math.abs(n - m);

		System.out.println(result);
	}

}
