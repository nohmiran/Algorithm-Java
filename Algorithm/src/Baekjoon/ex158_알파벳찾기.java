package Baekjoon;

import java.util.Scanner;

public class ex158_알파벳찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next(); // 입력

		for (char c = 'a'; c <= 'z'; c++) {

			// indexOf() : 특정 문자의 위치를 반환하는 메서드, 존재하지 않을 경우 1 반환
			System.out.print(str.indexOf(c) + " ");
		}
	}

}
