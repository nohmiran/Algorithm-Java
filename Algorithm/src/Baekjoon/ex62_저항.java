package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex62_저항 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = ""; // 처음 색 2개(저항값)

		long result = 0; // 최종 결과를 저장할 변수

		for (int i = 0; i < 3; i++) {
			String A = br.readLine();

			// 0,1일땐 저항의 값을 더하고, 2일땐 곱을 한다
			switch (A) {
			case "black":
				if (i == 2) {
					result *= 1;
				} else {
					S += "0";
				}
				break;
			case "brown":
				if (i == 2) {
					result *= 10;
				} else {
					S += "1";
				}
				break;
			case "red":
				if (i == 2) {
					result *= 100;
				} else {
					S += "2";
				}
				break;
			case "orange":
				if (i == 2) {
					result *= 1000;
				} else {
					S += "3";
				}
				break;
			case "yellow":
				if (i == 2) {
					result *= 10000;
				} else {
					S += "4";
				}
				break;
			case "green":
				if (i == 2) {
					result *= 100000;
				} else {
					S += "5";
				}
				break;
			case "blue":
				if (i == 2) {
					result *= 1000000;
				} else {
					S += "6";
				}
				break;
			case "violet":
				if (i == 2) {
					result *= 10000000;
				} else {
					S += "7";
				}
				break;
			case "grey":
				if (i == 2) {
					result *= 100000000;
				} else {
					S += "8";
				}
				break;
			case "white":
				if (i == 2) {
					result *= 1000000000;
				} else {
					S += "9";
				}
				break;
			}

			if (i == 1) {
				result = Long.parseLong(S);
			}
		}
		System.out.println(result);
	}

}