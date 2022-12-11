package Baekjoon;

import java.util.Scanner;

public class ex064_기찍N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 입력한 수
		
		// 입력한 수에서 -1씩 1까지 출력
		for (int i = num; i >= 1; i--) {
			System.out.println(i);

		}
	}

}
