package Baekjoon;

import java.util.Scanner;

public class ex201_히스토그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
	
		for (int i = 0; i < test; i++) {
			int num = sc.nextInt();
			
			for (int j = 1; j <= num; j++) {
				System.out.print("=");
			}

			System.out.println();
		}
	}

}
