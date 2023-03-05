package Baekjoon;

import java.util.Scanner;

public class ex199_아이들은사탕을좋아해 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 0; i < test; i++) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int result = 0;

			for (int j = 0; j < n; j++) {

				result += sc.nextInt() / k;
			}
			System.out.println(result);
		}
	}

}