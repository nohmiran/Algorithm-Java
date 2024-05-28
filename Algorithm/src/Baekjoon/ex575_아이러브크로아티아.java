package Baekjoon;

import java.io.*;
import java.util.*;

public class ex575_아이러브크로아티아 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int time = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int test = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			time += test;
			
			if (time > 210) {
                break;
            }
			if (str.equals("T")) {
                k++;
            }
			if (k == 9) {
                k = 1;                
            }
		}
		System.out.print(k);
	}
}
