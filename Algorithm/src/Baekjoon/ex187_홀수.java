package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex187_홀수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0; // 합
		int minimum = 0; // 최소값

		for (int i = 0; i < 7; i++) { // 7개의 자연수 입력

			int num = Integer.parseInt(br.readLine());

			if (num % 2 == 1) {

				if (minimum == 0) {
					minimum = num;
				}
				if (minimum > num) {
					minimum = num;
				}
				sum += num;
			}
		}
		if (sum == 0) { // 홀수가 없다면 (홀수가 없어 합이 0이라면) -1 출력
			
			System.out.println(-1);
			return;
		}
		System.out.println(sum); // 홀수들의 합
		System.out.println(minimum); // 홀수 중 최소값
	}
}
