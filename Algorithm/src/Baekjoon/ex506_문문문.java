package Baekjoon;

import java.io.*;

public class ex506_문문문 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] arr = {1, 0, 1, 0, 1, 0, 1};
		
		if (n > 5) {
			System.out.print("Love is open door");
		} else {
			for (int i = 2; i <= n; i++) {
				System.out.println(arr[m + i]);
			}
		}
	}
}
