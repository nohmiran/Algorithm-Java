package Baekjoon;

import java.util.Scanner;

public class ex110_대소문자바꾸기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i); // 한 글자씩 나눠서
			if (Character.isUpperCase(c)) { // 글자가 대문자라면
				String a = String.valueOf(c).toLowerCase(); // 소문자로
				System.out.print(a);
			} else { // 글자가 소문자라면
				String A = String.valueOf(c).toUpperCase(); // 대문자로
				System.out.print(A);
			}
		}
		System.out.println(result);
	}
}
