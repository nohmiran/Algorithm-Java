package Baekjoon;

import java.util.Scanner;
 
public class ex408_택시기하학 {
    
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double r = sc.nextDouble();
		
		System.out.println(r * r * Math.PI); // 유클리드 원의 넓이
		System.out.println(2 * r * r); // 택시기하학 원의 넓이
	}
}
