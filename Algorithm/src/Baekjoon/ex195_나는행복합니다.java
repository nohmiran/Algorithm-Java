package Baekjoon;

import java.util.Scanner;

public class ex195_나는행복합니다 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.print((k / m) + " " + (k % m));

	}

}
