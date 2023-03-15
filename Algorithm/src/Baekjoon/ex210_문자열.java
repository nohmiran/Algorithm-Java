package Baekjoon;

import java.util.Scanner;

public class ex210_문자열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			String word = sc.next();
			int index = word.length();
			
			String first = String.valueOf(word.charAt(0));
			String last = String.valueOf(word.charAt(index - 1));
			
			System.out.println(first + last);
		}
	}
}
