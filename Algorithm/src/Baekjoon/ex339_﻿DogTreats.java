package Baekjoon;

import java.util.*;

public class ex339_﻿DogTreats {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int h = s + 2 * m + 3 * l; // 1 × S + 2 × M + 3 × L
		
		System.out.print(h >= 10 ? "happy" : "sad");
	}
}
