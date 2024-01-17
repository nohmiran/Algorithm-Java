package Baekjoon;

import java.util.Scanner;

public class ex500_헛간청약 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int num = sc.nextInt(); // n마리의 소
        
        int w = sc.nextInt(); // 헛간 가로 길이
        int h = sc.nextInt(); // 헛간 세로 길이
        int l = sc.nextInt(); // 소들에게 배정되는 공간의 크기
        
		System.out.println(Math.min(num, (w / l) * (h / l))); // 최대로 헛간에 들어갈 수 있는 소의 수
	}
}
