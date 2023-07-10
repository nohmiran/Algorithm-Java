package Baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 317_N번째큰수 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			Integer arr[] = new Integer[10]; // 배열의 크기는 항상 10
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr,Collections.reverseOrder()); // reverseOrder: 내림차순으로 정렬!
			
			System.out.println(arr[2]); // 3번째로 큰 수 출력
		}
	}
}
