package Baekjoon;

import java.util.Scanner;

public class ex138_HelloJudge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Hello World, Judge " + i + "!");
		}

	}

}
