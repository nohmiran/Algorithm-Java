package Baekjoon;

import java.util.Scanner;

public class ex258_이상한기호 {

	public static void main(String[] args) throws Exception{
        
		Scanner sc = new Scanner(System.in);
        
		long num1 = sc.nextLong();
    long num2 = sc.nextLong();
        
		System.out.println((num1 + num2) * (num1 - num2));
	}
}
