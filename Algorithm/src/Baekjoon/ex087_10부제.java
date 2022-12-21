package Baekjoon;

import java.util.Scanner;

public class ex087_10부제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt(); // 날짜 일의 자리

		int num = 0; // 자동차 번호 일의 자리
		int cnt = 0; // 위반 자동차의 대수

		for (int i = 0; i < 5; i++) {

			num = sc.nextInt();

			if (day == num) { // 날짜의 일의 자리와 자동차 번호 일의 자리가 같다면
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
