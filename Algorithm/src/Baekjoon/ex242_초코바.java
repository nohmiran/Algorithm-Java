package Baekjoon;

import java.util.Scanner;

public class ex242_초코바 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 동전의 개수

		int choco = sc.nextInt();

		int haveCoin = num * 100; // 100원 동전 N개니까 곱하기 100

		if (haveCoin >= choco) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
