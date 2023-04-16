package Baekjoon;

import java.util.Scanner;

public class ex238_방학숙제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vacationDay = sc.nextInt(); // 방학 일 수
		int math = sc.nextInt(); // 수학 총 페이지
		int korean = sc.nextInt(); // 국어 총 페이지

		int mathMax = sc.nextInt(); // 수학 최대 양
		int koreanMax = sc.nextInt(); // 국어 최대 양

		int freeDay = 0;

		while (true) {

			math -= mathMax;
			korean -= koreanMax;
			freeDay++;

			if (math <= 0 && korean <= 0) {
				break;
			}
		}
		System.out.println(vacationDay - freeDay);
	}
}
