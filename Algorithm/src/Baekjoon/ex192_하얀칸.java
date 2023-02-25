package Baekjoon;

import java.util.Scanner;

public class ex192_하얀칸 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 0;

		// 8*8크기의 체스판, 하얀 칸에 있는 말의 개수 출력하는 문제
		// [0, 0], [0, 2], [0, 4]... [1, 1], [1, 3]... -> 하얀 칸
		// [i, j] => i + j 가 짝수이면 하얀 칸!
		for (int i = 0; i < 8; i++) {

			String str = sc.next();

			for (int j = 0; j < 8; j++) {

				// 만약 i + j 가 짝수이면서 F라고 적혀 있따면 result++ 해주쎄용
				if ((i + j) % 2 == 0 && str.charAt(j) == 'F') {
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
