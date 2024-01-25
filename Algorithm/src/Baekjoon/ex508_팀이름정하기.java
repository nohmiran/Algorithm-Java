package Baekjoon;

import java.io.*;
import java.util.*;

public class ex508_팀이름정하기 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = br.readLine();
		int num = Integer.parseInt(br.readLine());
		
		String love = "LOVE";

		int max = -1; 
		String result = "";
		
		int[] loveCount = new int[4];
		
		for (int i = 0; i < num; i++) {
			String team = br.readLine();
            
			for (int j = 0; j < 4; j++) {
				int count = name.length() - name.replace(String.valueOf(love.charAt(j)), "").length();
				count += team.length() - team.replace(String.valueOf(love.charAt(j)), "").length();
				loveCount[j] = count;
			}
			int total = 1;
            
			for (int j = 0; j < 4; j++) {
				for (int k = (j + 1); k < 4; k++) {
					total *= (loveCount[j] + loveCount[k]);
				}
			}
			if (max < (total % 100)) {
				max = total % 100;
				result = team;
			} else if (max == (total % 100)) {
				if (team.compareTo(result) < 0) {
	                result = team;
	            }
			}
		}
		System.out.println(result);
	}
}
