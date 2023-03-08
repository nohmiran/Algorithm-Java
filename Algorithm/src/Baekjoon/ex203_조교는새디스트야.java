package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex203_조교는새디스트야 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); // 헌우네 반 학생 수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0; // 맞는 학생 수 ㅠㅠ 아프것네
		
		for (int i = 1; i <= num; i++) {
			
			int currentLine = Integer.parseInt(st.nextToken()); // 현재 줄 서있는 순서대로 주어지는 학생들의 번호
			
			if (i != currentLine) {
				count++;
			}
		}
		System.out.println(count);
	}
}