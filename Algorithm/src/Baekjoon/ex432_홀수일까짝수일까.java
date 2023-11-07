package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ex432_홀수일까짝수일까 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		BigInteger number = new BigInteger("2");
		
		for(int i = 0 ; i < num ; i++) {
			BigInteger input = new BigInteger(sc.nextLine());
			
			if(input.mod(number).equals(BigInteger.ZERO)) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}
