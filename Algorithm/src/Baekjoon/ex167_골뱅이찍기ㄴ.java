package Baekjoon;

import java.util.Scanner;

public class ex167_골뱅이찍기ㄴ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num * 5; i++) {

			for (int j = 0; j < num * 5; j++) {

				if (i < num * 5 - num && j < num) {

					System.out.print("@");

				} else if (i >= num * 5 - num) {

					System.out.print("@");
				}
			}

			System.out.println();
		}
	}

}
