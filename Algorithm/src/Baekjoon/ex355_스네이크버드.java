package Baekjoon;

import java.io.*;
import java.util.*;

public class ex355_스네이크버드 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for (int i = 0; i < num; i++) {
			if (arr[i] > length) {
				break;
			}
			length++;
		}
		System.out.print(length);
	}
}
