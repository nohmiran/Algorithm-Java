package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex080_거스름돈 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = 1000 - Integer.parseInt(br.readLine()); // 받은 돈
		
		int result = 0;
		
		int[] arr = {500, 100, 50, 10, 5, 1}; // 거슬러 줄 수 있는 동전
		
		for (int i = 0; i < arr.length; i++) {
			
			if(money / arr[i] != 0) { // 나머지가 0이 아니라면
				
				result += money / arr[i]; 
				
				money %= arr[i]; /// 거슬러줄 수 있는 돈이 있을때까지 나눈다
			}
			
		}
		System.out.println(result);
	}

}
