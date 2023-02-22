package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex188_점수집계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); // 문제 갯수
		int[] arr = new int[5]; // 다섯 심판이 준 점수를 담을 다섯개의 배열칸

		for (int i = 0; i < num; i++) {// 입력된 문제 갯수만큼 for문이 돌아용
			for (int j = 0; j < arr.length; j++) { 

				arr[j] = sc.nextInt(); // 다섯심판이 준 점수 다섯개의 정수 입력
			}

			Arrays.sort(arr); // Arrays.sort로 오름차순 정렬

			// 최고점, 최저점을 뺀 나머지 3명 점수의 최고 점수 arr[3] - 최저 점수 arr[1]의 차이가 4점 이상이라면 점수 조정
			if (arr[3] - arr[1] >= 4) { 

				System.out.println("KIN"); // 점수 조정을 거친다면 KIN 출력

			} else
				System.out.println(arr[1] + arr[2] + arr[3]); // 최고 점수 arr[4]과 최저 점수 arr[0]를 제외한 총점 출력
		}
	}
}
