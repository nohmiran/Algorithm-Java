package Baekjoon;

import java.util.Scanner;

public class ex61_나누기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		N = (N / 100) * 100; // 마지막 두자리 00으로 바꾸기

		while (N % F != 0) // 나누어 떨어지는 수 찾기
			N++;

		N %= 100;

		if (N < 10) {// 10보다 작으면(한 자리 수라면)
			System.out.println("0" + N); // 앞에 0을 붙여서 출력
		} else {
			System.out.println(N);
		}
	}

}
