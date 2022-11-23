package Baekjoon;

import java.util.Scanner;

public class ex012_King {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rook = sc.nextInt();
		int bishop = sc.nextInt();
		int knight = sc.nextInt();
		int pawn = sc.nextInt();
		
		System.out.println(1-king);
		System.out.println(1-queen);
		System.out.println(2-rook);
		System.out.println(2-bishop);
		System.out.println(2-knight);
		System.out.println(8-pawn);
	}

}
