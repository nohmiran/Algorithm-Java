package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ex434_이진수덧셈 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		BigInteger num1 = new BigInteger(str1, 2);
		BigInteger num2 = new BigInteger(str2, 2);
		
		BigInteger sum = num1.add(num2);
		
		String result = sum.toString(2);
		
		System.out.println(result);
	}

}
