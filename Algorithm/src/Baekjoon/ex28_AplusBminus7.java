package Baekjoon;

import java.util.Scanner;

public class ex28_AplusBminus7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 문제 갯수
		
		for(int i = 1; i <= T; i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("Case #"+i+": "+(num1+num2));
			
		}
		
		
		

	}

}
