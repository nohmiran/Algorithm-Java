package Baekjoon;

import java.util.Scanner;

public class ex029_AplusBminus8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스의 개수

		for (int i = 1; i <= T; i++) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int result = num1 + num2;
			
			// "Case #x: A + B = C"형식으로 출력
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + result);

		}

	}
}
