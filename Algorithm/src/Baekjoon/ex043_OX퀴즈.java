package Baekjoon;

import java.util.Scanner;

public class ex043_OX퀴즈 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 문제 수 입력

		String arr[] = new String[num]; // 입력된 만큼 배열 칸 생성

		for (int i = 0; i < num; i++) { // 0번부터 입력된 수 -1 까지
			
			int cnt = 0; // O가 얼마나 연속되는지 셀 수 있는 count 변수
			int sum = 0; // 연속되는 O의 점수를 누적 합산할 sum 변수

			arr[i] = sc.next(); // 배열 칸 안에 문자 넣기

			// 입력된 O와 X를 보고 점수 합산
			for (int j = 0; j < arr[i].length(); j++) {

				if (arr[i].charAt(j) == 'O') { //

					cnt++;

					sum += cnt; // 누적합산
				} else// "0"가 연속되지 않는다면
					cnt = 0; // 0으로 초기화
			}

			System.out.println(sum);
		}

	}
}