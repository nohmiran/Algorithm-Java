package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex41_평균 {
	public static void main(String[] args) {

		// 시험 과목 수 N
		// 현재 점수 score
		// 점수 중 최대값 = M
		// 원점수 / 최고점수 * 100

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		double[] arr = new double[num]; // 시험 과목 수

		double sum = 0;

		for (int i = 0; i < num; i++) { // 과목 수만큼만 점수 입력(현재 점수)

			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // 오름차순 정렬(마지막 인덱스가 최대값)

		for (int i = 0; i < num; i++) {

			// (현재 점수 / 최고 점수 * 100)
			arr[i] = arr[i] / arr[arr.length - 1] * 100;

			sum = arr[i] + sum;
		}
		
		double avg = (sum / num); // 평균이 소수점까지 나오게 하기 위해 double 타입
		
		System.out.println(avg);

	}

}
