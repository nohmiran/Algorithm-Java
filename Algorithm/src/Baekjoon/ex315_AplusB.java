package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ex315_AplusB {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
       
		System.out.print(a.add(b));
	}
}
