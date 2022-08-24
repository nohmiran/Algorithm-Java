package Baekjoon;

import java.util.Scanner;

public class ex21_오븐시계 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 현재시간
		int hour = sc.nextInt();
		int min = sc.nextInt();

		// 걸리는 시간
		int time = sc.nextInt();

		int completion = (hour * 60) + min + time; 
		// (현재 시 * 60 = 분으로 환산됨) + 현재 분 + 걸리는 시간

		hour = (completion / 60) % 24; // (완성시간 / 60 = 시간) % 24
		min = completion % 60; // 완성 시간 % 60 (한 시간으로 나눈 나머지 == 분)

		System.out.println(hour + " " + min);
	}
}
