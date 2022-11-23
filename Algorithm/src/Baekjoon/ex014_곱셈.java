package Baekjoon;

import java.util.Scanner;

public class ex014_곱셈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 472
		int b = sc.nextInt(); // 385
		
		System.out.println(a * (b % 10)); // 472 * 5
		System.out.println(a * ((b / 10) % 10)); // 472 * 8
		System.out.println(a * (b / 100)); // 472 * 3
		System.out.println(a * b); // 472 * 385
		
	}

}
