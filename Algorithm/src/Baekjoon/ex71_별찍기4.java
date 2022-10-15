package Baekjoon;

import java.util.Scanner;

public class ex71_별찍기4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
		
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int k = star; k > i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
