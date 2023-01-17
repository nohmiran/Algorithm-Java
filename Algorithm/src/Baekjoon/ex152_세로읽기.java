package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex152_세로읽기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[][] arr = new char[5][15]; // 세로 5줄, 총 15개

		for (int i = 0; i < arr.length; i++) {
			
			// 문자열 입력
			String str = br.readLine();
			
			// 문자열을 배열에 하나씩 담아주기 위해 반복문 사용
			for (int j = 0; j < str.length(); j++) {
				
				arr[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < 15; i++) { // 출력시 총 15개의 문자열

			for (int j = 0; j < 5; j++) {

				if (arr[j][i] == '\0') { // char의 초기값 '\0' == 빈 값이라면 출력 x
					continue;
				}

				System.out.print(arr[j][i]);
			}
		}
	}

}
