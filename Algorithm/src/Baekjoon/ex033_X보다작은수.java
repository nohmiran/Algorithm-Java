package Baekjoon;

import java.util.Scanner;

public class ex033_X보다작은수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt(); // 정수 X

		int A[] = new int[N]; // 정수 N개로 이루어진 수열 A

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt(); // X만큼의 배열 칸 생성!
		}

		for (int i = 0; i < N; i++) {
			if (A[i] < X) { // A에서 X보다 작은 수를 모두 출력해줘
				System.out.print(A[i] + " ");
			}
		}
	}
}
