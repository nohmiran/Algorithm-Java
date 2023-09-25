package Baekjoon;

import java.util.*;
import java.math.*;

public class ex394_Julka {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		String totalApplesStr = sc.next();
		BigInteger totalApples = new BigInteger(totalApplesStr);
        
		String maxApplesStr = sc.next();
		BigInteger maxApples = new BigInteger(maxApplesStr);
        
		BigInteger avgApples = totalApples.subtract(maxApples).divide(new BigInteger("2"));
        
        BigInteger Klaudia = avgApples.add(maxApples);
        BigInteger Natalia = avgApples;
        
		System.out.println(Klaudia);
		System.out.println(Natalia);
	}
}
