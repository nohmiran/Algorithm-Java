package Baekjoon;

import java.util.Scanner;

public class ex204_수빈이와수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		int sum = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i] * (i + 1) - sum;
			sum += arr2[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}