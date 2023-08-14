package Baekjoon;

import java.util.*;
import java.io.*;

public class ex352_짝수를찾아라 {
    
	public static void main(String[] args) throws Exception{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
        
		for(int t = 0; t < test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
            
			int min = 999;
            int sum = 0;
            
			for(int i = 0; i < 7; i++) {
				int temp = Integer.parseInt(st.nextToken());
                
				if(temp % 2 == 0) {
					sum += temp;
                    
					if(min > temp){
						min = temp;
                    }
				}								
			}
			System.out.println(sum+" "+min);
		}
	}
}
