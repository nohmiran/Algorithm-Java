package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex055_사장님도박은재미로하셔야합니다 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		while (true) {
			int num = Integer.parseInt(br.readLine());

			if (num == -1) {
				
				break;
			
			}
			sum += num;
		}
		System.out.println(sum);
	}

}
