package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class ex456_반올림 {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int k = 1;
		int result = num;
		
		while(num > 0) {
			result = (int)((result / (double)k) + 0.5) * k;
			k *= 10;
			num /= 10;
		}
		System.out.println(result);
	}
}
