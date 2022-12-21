package Baekjoon;

import java.util.Scanner;

public class ex086_윷놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int[] arr = new int[4]; // 한 줄에 4개씩 (한 번에 던지는 윷이 4개니께..)
		for (int i = 0; i < 3; i++) { // 4개의 윷을 세 번 던지자
			cnt = 0;
			for (int j = 0; j < 4; j++) {
				arr[j] = sc.nextInt();
				if (arr[j] == 1) {
					cnt++;
				}
			}
			if (cnt == 4) { // 1 * 4 == 모
				System.out.println("E");
			}
			if (cnt == 3) { // 1 * 3 + 0 * 1 == 도
				System.out.println("A");
			}
			if (cnt == 2) { // 1 * 2 + 0 * 2 == 개
				System.out.println("B");
			}
			if (cnt == 1) { // 1 * 1 + 0 * 3 == 걸
				System.out.println("C");
			}
			if (cnt == 0) { // 1 * 0 + 0 * 4 == 윷
				System.out.println("D");
			}
		}
	}

}
