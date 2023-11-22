package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex445_출제비재분배 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int num = n + m;
		
		int[] pay = new int[num];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			pay[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < num; j++) {
				int temp = Integer.parseInt(st.nextToken());
				pay[i] -= temp;
				pay[j] += temp;
			}
		}
		for (int i = 0; i < num; i++) {
			sb.append(pay[i] + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
