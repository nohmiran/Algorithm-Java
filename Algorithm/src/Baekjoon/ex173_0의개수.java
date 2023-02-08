package Baekjoon;

import java.util.Scanner;

public class ex173_0의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// num1 ~ num2까지 수를 종이에 적었을 때 종이에 적힌 0 개수를 세면 됨
		
		int test = sc.nextInt(); // test케이스 수

		for (int i = 0; i < test; i++) { 
			// 문제 수 * 2 개의 수를 입력
			// 즉, 한 줄에 두 개의 수를 적고 그 두 개의 수에 적힌 0의 개수를 쓰는 것
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			int count = 0;

			for (int j = num1; j <= num2; j++) {
				int t = j;
				if (t == 0) {
					count++;
					continue;
				}
				while (t > 1) {
					if (t % 10 == 0) {
						count++;
					}
					t /= 10;
				}
			}
			System.out.println(count);
		}
	}
}
