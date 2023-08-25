package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex362_시험감독 {
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		long cnt = 0; 
		
		for(int i = 0; i < n; i++) {
			num[i] -= b;
			cnt++; // 총감독관 배정
			
			if(num[i] > 0) { 
				cnt += num[i] / c;
				num[i] %= c; 
				if(num[i] != 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
