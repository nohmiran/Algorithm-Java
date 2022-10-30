package Baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex79_AplusBminus6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int result = sc.nextInt();
		
		for (int i = 0; i < result; i++) {
			
			String s = sc.next();
			StringTokenizer st = new StringTokenizer(s, ",");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.println(a + b);
		}
	}
}
