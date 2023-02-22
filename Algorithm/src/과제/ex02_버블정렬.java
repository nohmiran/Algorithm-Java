package 과제;

import java.util.Scanner;

public class ex02_버블정렬 {

	public static void main(String[] args) {

		// 낮은 수 부터(오름차순)
		Scanner sc = new Scanner(System.in);

		int[] bubble = new int[5]; // 5개의 숫자를 입력받을 칸 5개
		int temp;

		// 입력받은 숫자 -> 배열에 넣어주기
		for (int i = 0; i < bubble.length; i++) {
			bubble[i] = sc.nextInt(); // {10, 47, 3, 69, 54}
		}

		for (int i = 0; i < bubble.length; i++) { // [0], [1], [2], [3], [4]
			for (int j = 0; j < bubble.length - i - 1; j++) { // 가장 큰 값 1개(69)가 정렬이 되었으니 길이를 1 줄여준다.
				
				if (bubble[j] > bubble[j + 1]) { // 만약, [0]이 [1]보다 더 크다면

					// 버블정렬
					temp = bubble[j]; // 0번째 값을 temp에 넣어주고
					bubble[j] = bubble[j + 1]; // 1번째 값을 0번째에 넣어주고
					bubble[j + 1] = temp; // temp를 1번째에 넣어주기
				}
				//    [0][1][2][3][4][5]
				// -- 10, 47, 3, 69, 54 (초기 값)
				// 1. [10, 47], 3, 69, 54 교환없음
				// 2. 10, [47, 3], 69, 54
				// 3. 10, 3, [47, 69], 54 교환없음
				// 4. 10, 3, 47, [54, 69]
				// 5. 10, 3, [47, 54], 69 교환없음
				// 6. 10, [3, 47], 54, 69 교환없음
				// 7. [3, 10], 47, 54, 69
			}
		}

		for (int i = 0; i < bubble.length; i++) {
			System.out.print(bubble[i] + " ");
		}
		sc.close();
	}

}
