package Baekjoon;

import java.io.*;
import java.math.*;

public class ex382_사탕선생고창영 {
    
	public static void main(String[] args) throws Exception{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
    
		for (int i = 0; i < test; i++) {
			br.readLine();
			String answer = "NO";
			int num = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
      
			for (int j = 0; j < num; j++) {
				sum = sum.add(new BigInteger(br.readLine()));
                }
			if (sum.mod(new BigInteger(String.valueOf(num)))==BigInteger.ZERO) {
				answer = "YES";
            }
			System.out.println(answer);
		}		
	}
}
