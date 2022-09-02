package Baekjoon;

import java.util.Scanner;

public class ex30_별찍기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { // 행
			for(int j = 1; j <= i; j++) { // 열
				System.out.print("*");
			}System.out.println();
		}

	}

}
