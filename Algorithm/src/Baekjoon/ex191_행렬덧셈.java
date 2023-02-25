package Baekjoon;

import java.util.Scanner;

public class ex191_행렬덧셈 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 행
		int M = sc.nextInt(); // 열

		int[][] arr = new int[N][M]; // 행렬

		for (int i = 0; i < 2; i++) { // 행렬의 개수만큼 두번 반복
			
			for (int j = 0; j < N; j++) { // 행렬의 행만큼 반복
				
				for (int k = 0; k < M; k++) { // 행렬의 열만큼 반복
					arr[j][k] += sc.nextInt();
				}
			}
		}

		for (int i = 0; i < N; i++) { // 행렬의 행 길이만큼 반복
			
			for (int j = 0; j < M; j++) { // 행렬의 열만큼 반복
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
