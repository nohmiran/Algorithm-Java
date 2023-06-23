package Baekjoon;

import java.util.Scanner;

public class ex304_트럭주차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int truck1 = sc.nextInt();
		int truck2 = sc.nextInt();
		int truck3 = sc.nextInt();

		int[] arr = new int[101];
        
		for (int i = 0; i < 3; i++) {
            
			int start = sc.nextInt();
			int end = sc.nextInt();
            
			for (int j = start; j < end; j++) {
				arr[j]++;
			}
		}

		int fare = 0;
        
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				fare += truck1;
			}
			if (arr[i] == 2) {
				fare += (truck2 * 2);
			}
			if (arr[i] == 3) {
				fare += (truck3 * 3);
			}
		}
		System.out.println(fare);
	}
}
