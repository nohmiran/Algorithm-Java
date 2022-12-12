package Baekjoon;

import java.util.Scanner;

public class ex120_ACM호텔 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int test = sc.nextInt();	// 테스트 케이스
 
		for(int i = 0; i < test; i++) {
			
			int floor = sc.nextInt(); // 호텔의 층
			int n = sc.nextInt(); // 한 층에 n개의 방이 있다.
			int guest = sc.nextInt(); // 손님쓰
			
			if(guest % floor == 0) {
				System.out.println((floor * 100) + (guest / floor));
 
			} else {
				System.out.println(((guest % floor) * 100) + ((guest / floor) + 1));
			}
		}
	}

}
