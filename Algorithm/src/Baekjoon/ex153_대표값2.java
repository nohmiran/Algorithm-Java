package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex153_대표값2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5]; // 다섯개 입력 받기 위해 배열 만들어주기
		int sum = 0; // 평균 값 구하기 위해 총 합을 넣어줄 변수도 지정

		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt(); // 수 입력받고
			arr[i] += num; // 배열 0번째 칸부터 차례대로 num 넣어주기
			sum += num; // 평균 값 구하기 위해 누적합산
		}

		int avg = sum / 5;

		System.out.println(avg); // 평균 값 출력

		Arrays.sort(arr);
		
		System.out.println(arr[2]); // 0번째 ~ 4번째의 중간은 2번째

	}

}
