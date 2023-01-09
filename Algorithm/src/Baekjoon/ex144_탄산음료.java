package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex144_탄산음료 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int haveBottle = Integer.parseInt(st.nextToken()); // 가지고 있는 빈병 수
		int findBottle = Integer.parseInt(st.nextToken()); // 발견한 빈병 수
		int needBottle = Integer.parseInt(st.nextToken()); // 새병으로 바꾸는데 필요한 빈병 수
		int result = haveBottle + findBottle; // 총 가지고 있는 빈병 수
		int drinkCnt = 0; // 마실 수 있는 탄산 음료 개수

		while (needBottle <= result) {

			int drink = result / needBottle; // 현재 마실 수 있는 음료수
			
			drinkCnt += drink; // 현재 마실 수 있는 음료수
			
			result = drink + (result % needBottle); // 이전에 교환해서 마신 음료수 + 빈병
		}

		System.out.println(drinkCnt);
		
		br.close();
	}

}
