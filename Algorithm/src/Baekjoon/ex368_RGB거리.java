package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex368_RGB거리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][3];
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
				
			arr[i][0] = Math.min(arr[i - 1][1], arr[i - 1][2]) + r;
			arr[i][1] = Math.min(arr[i - 1][0], arr[i - 1][2]) + g;
			arr[i][2] = Math.min(arr[i - 1][0], arr[i - 1][1]) + b;
		}
		System.out.println(Math.min(arr[n][0], Math.min(arr[n][1], arr[n][2])));
	}
}
