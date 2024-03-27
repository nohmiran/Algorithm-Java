package Baekjoon;

import java.util.*;
import java.io.*;

public class ex558_주식투자 {
    
	public static void main(String[] args) throws Exception{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
        
		for(int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine());
            int result = 0;
			for(int j = 0; j < n; j++) {
				int temp = 0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k = 0; k < 3; k++)
					temp = Math.max(temp,Integer.parseInt(st.nextToken()));
				result += temp;
			}
			System.out.println(result);
		}
	}
}
