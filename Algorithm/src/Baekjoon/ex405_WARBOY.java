package Baekjoon;

import java.util.Scanner;

public class ex405_WARBOY {
    
	public static void main(String[] args) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		
		int CompetitorPrice = sc.nextInt(); // 경쟁사 가격
		int CompetitorPerformance = sc.nextInt(); // 경쟁사 제품 성능
		int WarboyPrice = sc.nextInt(); // WARBOY 가격
		
		System.out.println(CompetitorPerformance / CompetitorPrice * WarboyPrice * 3);
	}
}
