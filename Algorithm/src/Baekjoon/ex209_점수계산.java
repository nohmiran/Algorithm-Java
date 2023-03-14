package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex209_점수계산 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine()); // 테스트 개수
		int result = 0; // 총 점수
		int score = 0; // 점수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < test; i++) {
		
			int num = Integer.parseInt(st.nextToken());
			
			if (num == 1) { // 맞으면
			
				score++; // 점수 증가시키고
				result += score; // 누적합산
			} else {
				
				score = 0;
			}
		}
		System.out.print(result);
	}

}
