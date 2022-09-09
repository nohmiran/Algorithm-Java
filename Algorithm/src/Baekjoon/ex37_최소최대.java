package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex37_최소최대 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int[] arr = new int[x]; // 입력한 길이만큼 배열 칸 만들기

		int min = 1000000;
		int max = -1000000;

		for (int i = 0; i < x; i++) { // 배열 길이만큼 돌면서 i입력값 받기
			arr[i] = sc.nextInt();

			if (max < arr[i]) { //입력값이 최댓값보다 크면 max에 저장
				max = arr[i];
			}
			if (min > arr[i]) { //입력값이 최솟값보다 작으면 min에 저장
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}

}
