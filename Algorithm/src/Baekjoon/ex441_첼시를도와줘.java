package Baekjoon;

import java.io.*;
import java.util.*;

public class ex441_첼시를도와줘 {
    
	public static void main(String[] args) throws Exception{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
        
		for(int i = 0; i < test; i++) {
			int count = Integer.parseInt(br.readLine());
            int max = 0;
			String maxName = "";
            
			for(int j = 0; j < count; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
                
				int price = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
                
				if(price > max) {
					max = price;
					maxName = name;
				}
			}
			System.out.println(maxName);
		}
	}
}
