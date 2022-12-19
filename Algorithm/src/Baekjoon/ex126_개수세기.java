package Baekjoon;

import java.util.Scanner;

public class ex126_개수세기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // num개의 array칸
		int[] arr = new int[num];
		int count = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt(); // num만큼 array칸에 숫자를 입력
		}

		int result = sc.nextInt(); // result와 같은 수를 찾기 위해 입력 받아야해욥~

		for (int i = 0; i < arr.length; i++) {
			if (result == arr[i]) { // 입력된 수와 arr[i]에 담긴 수가 같다면
				count++; // count + 1
			}
		}

		System.out.println(count);

	}

}
