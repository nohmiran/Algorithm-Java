package Baekjoon;

import java.util.Scanner;

public class ex31_별찍기2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {// 입력한 수만큼 자리(?)가 생긴다
			for (int j = num - 1; j >= i; j--) {// 입력한 수 -1 만큼 공백을 찍는다
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
