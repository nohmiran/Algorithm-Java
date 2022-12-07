package Baekjoon;

import java.util.Scanner;

public class ex114_핸드폰요금 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 통화의 개수
		
		int y = 0; // 영식
		int m = 0; // 민식
		
		for (int i = 0; i < num; i++) {
			
			int time = sc.nextInt(); // 전화한 시간
			
			y += ((time / 30) + 1) * 10;
			m += ((time / 60) + 1) * 15;

		}
		if (y == m) {
			System.out.println("Y M " + y);
		} else if (y < m) {
			System.out.println("Y " + y);
		} else if (y > m) {
			System.out.println("M " + m);
		}

	}

}
