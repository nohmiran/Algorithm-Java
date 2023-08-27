package Baekjoon;

import java.util.Scanner;

public class ex364_딱지놀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			int num1 = sc.nextInt();
			int[] A = new int[5];
			for (int j = 0; j < num1; j++) {
				A[sc.nextInt()]++;
			}
			int num2 = sc.nextInt();
			int[] B = new int[5];
			for (int j = 0; j < num2; j++) {
				B[sc.nextInt()]++;
			}

			for (int j = 4; j >= 1; j--) {
				if (A[j] > B[j]) {
					System.out.println("A");
					break;
				} else if (A[j] < B[j]) {
					System.out.println("B");
					break;
				} else {
					if (j == 1) {
						System.out.println("D");
						break;

					}
				}
			}
		}
	}
}
