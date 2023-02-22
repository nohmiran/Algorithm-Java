package 과제;

import java.util.Scanner;

public class ex03_순위정렬 {

	public static void main(String[] args) {

		// 순위 매기기
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5]; // 5개의 숫자를 입력받을 칸 5개
		int[] rank = { 1, 1, 1, 1, 1 }; // 순위 초기화

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt(); // {10, 47, 3, 69, 54}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] > num[j]) { // [i]가 [j]보다 더 크다면
					rank[i] += 1; // 1더해주기
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(rank[i] + "위 "); // 순위출력
		}
	}
}
