package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex058_약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt(); // 약수 개수
		int[] arr = new int[count]; // 약수의 개수만큼 배열칸을 만들어준다.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // 약수 입력
		}
		Arrays.sort(arr); // 오름차순으로 정렬해주고,

		int min = arr[0]; // 제일 작은 수 [0]
		int max = arr[count - 1]; // 제일 큰 수 [count - 1]
		System.out.println(min * max);

	}
}