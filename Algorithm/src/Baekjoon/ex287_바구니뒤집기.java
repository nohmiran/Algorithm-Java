package Baekjoon;

import java.util.Scanner;

public class ex287_바구니뒤집기 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
        
		for(int i = 0; i < N; i++) {
			arr[i] = (i + 1);
		}
		int count = 0;
        
		while(count < M) {
			int i = (sc.nextInt() - 1);
			int j = (sc.nextInt() - 1);
            
			while(j > i) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
				i++;
			}
			count++;
		}
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
