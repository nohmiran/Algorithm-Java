package Baekjoon;

import java.util.*;

public class ex069_별찍기3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = i + 1; j <= num; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

}