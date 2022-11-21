package Baekjoon;

import java.util.Scanner;

public class ex98_음계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[8];
		String str = "";

		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) { // arr의 길이만큼 for문이 돌텐디

			if (arr[i + 1] == arr[i] + 1) {// 다음 arr에 담긴 수가 그 전 arr에 담긴 수보다 1이 더 크다면 (오름차순)
				str = "ascending"; // ascending!

			} else if (arr[i + 1] == arr[i] - 1) { // 다음 arr에 담긴 수가 그 전 arr에 담긴 수보다 1이 더 작다면 (내림차순)
				str = "descending"; // descending!

			} else { // 오름차순도 내림차순도 아니라면
				str = "mixed"; // mixed!
				break;
			}
		}
		System.out.println(str);
	}

}
