package Baekjoon;

import java.util.Scanner;

public class ex77_알파벳개수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int[] n = new int[26];
		for (int i = 0; i < s.length(); i++) {
			n[s.charAt(i) - 97]++;
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(n[i] + " ");
		}
	}
}
