package Baekjoon;

import java.math.*;
import java.util.*;

public class ex446_Multiply {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int m = sc.nextInt();
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		System.out.println(a.multiply(b));
	}
}
