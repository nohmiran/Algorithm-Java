package Baekjoon;

import java.math.*;
import java.util.*;

public class ex367_암호제작 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		BigInteger privateKey = new BigInteger(sc.next());
		int limit = sc.nextInt();
		boolean isNotGood = false;
		boolean[] isNotPrime = new boolean[limit + 1];
		isNotPrime[1] = true;
        
		for (int i = 2; i <= limit; i++) {
			for (int j = 2; i * j <= limit; j++) {
				isNotPrime[i * j] = true;
			}
		}
		for (int i = 2; i < limit; i++) {
			if (!isNotPrime[i] && privateKey.mod(BigInteger.valueOf(i)) == BigInteger.ZERO) {
				System.out.println("BAD " + i);
				isNotGood = true;
				break;
			}
		}
		if (!isNotGood) {
			System.out.println("GOOD");
		}
	}
}
