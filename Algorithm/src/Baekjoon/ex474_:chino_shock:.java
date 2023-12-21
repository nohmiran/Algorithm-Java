package Baekjoon;

import java.io.*;

public class ex474_:chino_shock: {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int a = str.length();
		int c = 0;
		
		for (int i=0; i<a; i++) {
			if (str.charAt(i) == '_') {
				c++;
			}
		}
		System.out.print(a + 2 + c * 5);
	}
}
