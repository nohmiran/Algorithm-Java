package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ex365_부호 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 0; t < 3; t++) {
			BigInteger bigger = new BigInteger("0");
			int N = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < N; i++) {
				BigInteger num = new BigInteger(br.readLine());
				bigger = bigger.add(num);
			}
			
			if (bigger.compareTo(BigInteger.ZERO) == 1) {
				System.out.println("+");
			} else if (bigger.compareTo(BigInteger.ZERO) == 0) {
				System.out.println("0");
			} else {
				System.out.println("-");
			}
		}
	}
}
