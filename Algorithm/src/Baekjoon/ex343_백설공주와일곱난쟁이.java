package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex343_백설공주와일곱난쟁이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		int check1 = 0;
		int check2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					check1 = i;
					check2 = j;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i != check1 && i != check2) {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.println(sb);
	}
}
