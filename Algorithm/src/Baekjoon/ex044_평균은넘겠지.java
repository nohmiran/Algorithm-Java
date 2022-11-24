package Baekjoon;

import java.util.Scanner;

public class ex044_평균은넘겠지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();

		for (int i = 0; i < C; i++) {
			int N = sc.nextInt();
			int[] score = new int[N]; // 학생 수
			double cnt = 0;
			double sum = 0;
			double avg = 0;

			// 점수 입력
			for (int j = 0; j < N; j++) { 
				score[j] = sc.nextInt(); // 학생 수만큼 점수 입력
				sum += score[j]; // 입력된 점수 모두 더하기
			}
			avg = sum / N; // 평균 = 입력된 점수 / 학생 수

			// 평균 넘는 학생 수 카운트
			for (int j = 0; j < N; j++) {
				if (score[j] > avg) // 평균보다 점수가 높다면 cnt++
					cnt++; 
			}
			// %.3f -> 소수점 3자리 수까지 나타내기(0.000)
			System.out.println(String.format("%.3f", cnt / N * 100, 3) + "%");
		}
	}
}
