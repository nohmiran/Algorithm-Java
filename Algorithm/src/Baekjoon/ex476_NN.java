package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex476_NN {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int numberN = Integer.valueOf(n);
		int m = Integer.valueOf(st.nextToken());
		int len = n.length();
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < numberN * len && i <= m; i += len) {
			sb.append(n);
		}
		
		if(sb.length() > m) {
			System.out.print(sb.toString().substring(0, m));
		}
		else {
			System.out.print(sb.toString());
		}
	}
}
