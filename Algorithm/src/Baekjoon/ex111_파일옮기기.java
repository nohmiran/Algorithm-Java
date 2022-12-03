package Baekjoon;

import java.util.Scanner;

public class ex111_파일옮기기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 첫 번째 줄
		int apple1 = scan.nextInt();
		int orange1 = scan.nextInt();
		// 두 번쨰 줄
		int orange2 = scan.nextInt();
		int apple2 = scan.nextInt();

		// 사과와 오렌지를 옮기는 최소 횟수
		int result = Math.min(apple1 + apple2, orange1 + orange2);
		System.out.println(result);
	}

}
