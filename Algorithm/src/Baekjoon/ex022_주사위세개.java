package Baekjoon;

import java.util.Scanner;

public class ex022_주사위세개 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int result;

		// 세 주사위의 수가 모두 같을 때
		if (num1 == num2 && num2 == num3) {

			result = 10000 + num1 * 1000;

			// 두 주사위의 수만 같을 때
		} else if (num1 == num2 || num1 == num3) {
			result = 1000 + num1 * 100;

		} else if (num2 == num3) {

			result = 1000 + num2 * 100;

			// 모든 주사위의 수가 다를 때
		} else {

			// Math.max -> 가장 큰 수를 반환해주는 함수
			result = Math.max(num1, Math.max(num2, num3)) * 100;

		}
		System.out.println(result);
	}

}
