package Baekjoon;

import java.util.Scanner;

public class ex202_줄번호 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= num; i++) {
			System.out.println((i) + ". " + sc.nextLine());
		}

	}

}
