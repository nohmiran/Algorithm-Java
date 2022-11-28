package Baekjoon;

import java.util.Scanner;

public class ex103_영수증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		
		for(int i = 0; i < 9; i++) {
			result -= sc.nextInt();
		}
		System.out.println(result);
	}

}
