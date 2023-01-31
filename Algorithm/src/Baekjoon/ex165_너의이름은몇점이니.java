package Baekjoon;

import java.util.Scanner;

public class ex165_너의이름은몇점이니 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt(); // 이름의 길이
		String name = sc.next(); // 이름

		int result = 0; // 점수 합산할 변수

		for (int i = 0; i < length; i++) {

			// A의 아스키코드는 65
			// 문제에서 A는 1
			// (name.chatAt)-64를 해줘야 한다.
			result += name.charAt(i) - 64;
		}

		System.out.println(result);
	}

}
