package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex46_아스키코드 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int asc = br.readLine().charAt(0); // 문자열에서 0번째 문자의 아스키코드 번호를 반환
		
		System.out.println(asc);
	}

}
