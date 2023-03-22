package Baekjoon;

import java.util.Scanner;

public class ex216_스타후르츠 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt(); // 여름이 day일까지 지속
		int time = sc.nextInt(); // 스타후르츠가 자라는데 걸리는 시간 time
		int blank = sc.nextInt(); // 스타후르츠를 심을 수 있는 빈 칸 blank
		int revenue = sc.nextInt(); // 스타후르츠 한 개 판매하면 얻는 수익 revenue
		
		System.out.println((day - 1) / time * blank * revenue);
	}

}
