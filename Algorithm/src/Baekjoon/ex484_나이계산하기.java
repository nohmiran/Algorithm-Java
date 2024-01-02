package Baekjoon;

import java.util.Scanner;

public class ex484_나이계산하기 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int y1 = Integer.parseInt(sc.next());
		int m1 = Integer.parseInt(sc.next());
		int d1 = Integer.parseInt(sc.next());
		int y2 = Integer.parseInt(sc.next());
		int m2 = Integer.parseInt(sc.next());
		int d2 = Integer.parseInt(sc.next());
		int age = y2 - y1;
		
		if ( y1 == y2) {
			System.out.println(age);
		} else {
			if (m1 > m2) {
				System.out.println(age -1);
			} else if (m1 == m2) {
				if (d1 <= d2) {
					System.out.println(age);
				} else {
					System.out.println(age -1);
				}
			} else {
				System.out.println(age);
			}
		}
		System.out.println(age + 1);
		System.out.println(age);
	}
}
