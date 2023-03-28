package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex221_학점계산 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String score = br.readLine();
		
		double result = 0; // 학점이 소수점으로 나와야하니까 int정수형x 
		
		char c = score.charAt(0);
		
		if (c == 'A') {
			result = 4;
		} else if (c == 'B') {
			result = 3;
		} else if (c == 'C') {
			result = 2;
		} else if (c == 'D') {
			result = 1;
		} else {
			System.out.print("0.0");
			return;
		}
		
		c = score.charAt(1);
		if (c == '+') {
			result += 0.3;
		} else if (c == '-') {
			result -= 0.3;
		}
		
		System.out.print(result);

	}

}
