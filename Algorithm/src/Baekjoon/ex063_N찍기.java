package Baekjoon;

import java.util.Scanner;

public class ex063_N찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 자연수 N
		// 1부터 N까지 한 줄에 하나씩 출력
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
			
		}
	}

}
