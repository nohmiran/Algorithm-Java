package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex581_Pups {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        
		for (int i = 0; i<n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double d = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double p = Double.parseDouble(st.nextToken());
			System.out.printf("$%.2f\n", d * f * p);
		}
	}
}
