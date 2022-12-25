package Baekjoon;

import java.util.Scanner;

public class ex132_별찍기8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		// 첫줄 -> 별 하나 찍고 (입력한 수 - 줄 수)만큼 공백
		//       (입력한 수 - 줄 수)만큼 공백 후 별 하나 찍기
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int k = 2 * num - i; k > 0; k--) {
				if (k > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 하단 별찍기
		for (int i = 2; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print("*");
			}
			for (int k = 1; k < i * 2 - 1; k++) {
				System.out.print(" ");
			}
			for (int h = num; h >= i; h--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}