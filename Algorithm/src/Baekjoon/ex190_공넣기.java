package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex190_공넣기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		int[] arr = new int[num]; // 도현이가 가지고 있는 바구니 num개
		
		// 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 
		// 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
		
		int count = Integer.parseInt(st.nextToken()); // 도현이가 공을 넣는 횟수

		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());

			// 공을 넣는 방법 3가지
			// case1번 바구니부터 case2번 바구니까지에 (ball)번 번호가 적혀져 있는 공을 넣는다
			// 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다.
			int case1 = Integer.parseInt(st.nextToken());
			int case2 = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());

			for (int j = case1 - 1; j < case2; j++) {
				arr[j] = ball;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
