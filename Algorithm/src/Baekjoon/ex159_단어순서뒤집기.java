package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex159_단어순서뒤집기 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			
			String str = br.readLine();
			String arr[] = str.split(" ");

			System.out.print("Case #" + (i) + ": ");
			
			for (int j = arr.length - 1; j >= 0; j--) {
				
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
