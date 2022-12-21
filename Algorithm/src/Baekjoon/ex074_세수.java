package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex074_세수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()}; // 3개의 입력 칸을 만들어준다.
		
		Arrays.sort(arr); // 오름차순 정렬
		
		System.out.println(arr[1]); // 두 번째로 큰 수 출력
		
		
	}

}
