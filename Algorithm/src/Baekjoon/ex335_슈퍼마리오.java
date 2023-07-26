package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex335_슈퍼마리오 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int result = 0;
        
		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;

			if(Math.abs(100 - sum) <= Math.abs(100 - result)) {
				result = sum;
			} else {
                break;
            }
		}
		System.out.println(result);
	}
}
