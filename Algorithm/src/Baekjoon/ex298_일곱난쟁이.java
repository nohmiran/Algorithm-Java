package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex298_일곱난쟁이 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
        
		int y = 0;
		int x = 0;
        
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((sum - arr[i] - arr[j]) == 100) {
					y = i;
					x = j;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i != y && i != x) {
				System.out.println(arr[i]);
			}
		}
	}
}
