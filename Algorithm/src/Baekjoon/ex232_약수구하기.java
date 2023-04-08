package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex232_약수구하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		int order = Integer.parseInt(st.nextToken()); // 몇번째?

		int count = 0; // 약수의 순서
		int result = 0;

		// 약수 구하는 반복문
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				count++; // 약수 나오면 count +1
			}

			if (count == order) {
				result = i; // count가 order와 같아지면(약수라면) result에 저장
				break;
			}
		}
		System.out.println(result);
	}
}