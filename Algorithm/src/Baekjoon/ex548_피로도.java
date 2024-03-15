package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex548_피로도 {

	public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int hour = 0;
		int workHour = 0;
		int g = 0;
		while (hour < 24) {
			if (a > m) break;
			if (g + a <= m) {
				workHour++;
				g += a;
				hour++;
			} else {
				g = (g - c < 0) ? 0 : g - c;
				hour++;
			}
		}
		System.out.println(workHour * b);
		br.close();
	}
}
