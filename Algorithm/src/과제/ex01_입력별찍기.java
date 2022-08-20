package 과제;

import java.util.Scanner;

public class ex01_입력별찍기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int i, j;

		// 상단 삼각형
		for (i = 0; i < (num + 1) / 2; i++) {  // 5줄일 때 5+1/2 = 3
			for (j = num / 3; j >= i; j--) { 
				System.out.print(" ");
			}
			for (j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 하단 삼각형
		for (i = (num) / 2; i > 0; i--) {
			for (j = (num) / 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
