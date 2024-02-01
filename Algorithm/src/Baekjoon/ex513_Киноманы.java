package Baekjoon;

import java.io.*;
import java.util.*;

public class ex513_Киноманы {
    
	public static void main(String[] args) throws Exception{
        
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		
		int result = (a1 * 3 + a2 * 20 + a3 * 120) - (b1 * 3 + b2 * 20 + b3 * 120);
        
		if (result == 0 ) {
			System.out.println("Draw");
		} else if(result > 0) {
			System.out.println("Max");
		} else {
			System.out.println("Mel");
		}
	}	
}
