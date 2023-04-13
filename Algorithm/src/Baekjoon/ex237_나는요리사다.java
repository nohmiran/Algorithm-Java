package Baekjoon;

import java.util.Scanner;

public class ex237_나는요리사다 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] sum = new int[5][4];

		int result = 0;
		int rank = 0;
		int max = 0;

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = sc.nextInt(); // 각 배열칸에 점수 입력해주고
				result += sum[i][j]; // 합산
			}
			if (max < result) { // 가장 큰 점수보다 합산된 점수가 크면
				max = result; // max변수가 닉값할 수 있도록 result 값으로 갈아치우기
				rank = i + 1; // 인덱스가 0부터 시작하니까 등수를 뽑으려면 +1을 해줘야겠죠
			}
			result = 0;
		}
		System.out.println(rank + " " + max);
	}
}