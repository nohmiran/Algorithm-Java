package Baekjoon;

import java.io.*;
import java.util.*;

public class ex417_Darius님한타안함 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "/");
		
		int k = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		if (k + a < d || d == 0) {
			System.out.print("hasu");
		} else {
			System.out.print("gosu");
		}
	}
}
