package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex491_완전제곱수 {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		int a = 0;
        int b = 0;
		
		for(int i = 1; i < 501; i++) {
			b = i;
			
			a = (int) Math.sqrt((b * b) + num);
			
			if((a * a) - num == b * b) {
				count++;
			}
		}
		System.out.println(count);
	}
}
