package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ex143_큰수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		 long temp = 0;
		 
	        for (int i = 0; i < str.length(); i++) {
	        	
	        	temp = (temp * 10 + (str.charAt(i) - '0')) % 20000303;
	        }
	        
	        System.out.println(temp);
	}

}
