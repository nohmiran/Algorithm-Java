package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex214_문자와문자열 {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().trim();
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(str.substring(num - 1, num));
	}
	
	
}
