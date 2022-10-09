package Baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex66_단어의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");

		System.out.println(st.countTokens()); // countTokens() : 토큰의 개수
	}

}
