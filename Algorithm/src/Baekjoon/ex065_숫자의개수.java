package Baekjoon;

import java.util.Scanner;

public class ex065_숫자의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] count = new int[10];
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int result = num1 * num2 * num3;

		while (result > 0) { // result가 0보다 클 때만 반복
			count[result % 10]++;
			result /= 10;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}

}
