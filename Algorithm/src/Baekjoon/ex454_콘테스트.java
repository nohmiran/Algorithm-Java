package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex454_콘테스트 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int w[] = new int[10]; // w대학 참가자 점수
		int k[] = new int[10]; // k대학 참가자 정수
		
		for(int i = 0; i < 10; i++) {
			w[i] = sc.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			k[i] = sc.nextInt();
		}
		// 오름차순으로 정렬해서 맨 마지막(득점 높은) 3명의 점수를 합산
		Arrays.sort(w); // 오름차순 정렬
		Arrays.sort(k);
        
		int sumW = 0; // w대학 점수
		int sumK = 0; // k대학 점수

        for(int i = 7; i < 10; i++) { // 높은 사람 3명 점수 합산
			sumW += w[i];
		}
		for(int i = 7; i < 10; i++) { // 높은 사람 3명 점수 합산
			sumK += k[i];
		}
		System.out.print(sumW+" "+sumK);
	}

}
