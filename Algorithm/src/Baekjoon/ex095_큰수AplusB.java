package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ex095_큰수AplusB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger num1 = sc.nextBigInteger();
		BigInteger num2 = sc.nextBigInteger();
		
		System.out.println(num1.add(num2));
	}

}
