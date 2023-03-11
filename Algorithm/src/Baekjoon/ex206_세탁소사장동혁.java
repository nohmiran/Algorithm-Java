package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex206_세탁소사장동혁 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine()); // 문제 개수
		int quarter = 25; // 쿼터 0.25
		int dime = 10; // 다임 0.10
		int nickel = 5; // 니켈 0.05
		int penny = 1; // 페니 0.01

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < test; i++) {

			int coin = Integer.parseInt(br.readLine());

			sb.append(coin / quarter + " ");
			coin %= quarter;

			sb.append(coin / dime + " ");
			coin %= dime;

			sb.append(coin / nickel + " ");
			coin %= nickel;

			sb.append(coin / penny + "\n");
		}

		System.out.print(sb);
	}

}
