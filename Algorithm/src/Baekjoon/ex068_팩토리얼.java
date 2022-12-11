package Baekjoon;

import java.util.Scanner;

public class ex068_팩토리얼 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// factorial은 모르겠고 그냥 for문으로 작성해봐야지
		int n = sc.nextInt();
		
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
			
		}

		System.out.println(result);

	}
}