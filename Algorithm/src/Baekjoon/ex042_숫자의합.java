package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex042_숫자의합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); // 몇 개의 숫자로 나눠줄지 num입력
		
		String[] str = br.readLine().split(""); // 입력된 문자를 배열 칸(num)만큼 나눠준다.
	
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			sum += Integer.parseInt(str[i]); // 입력된 수를 누적 합산
		}

		System.out.println(sum);
	}

}
