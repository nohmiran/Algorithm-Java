package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex421_오렌지먹은지오랜지 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		String str = in.readLine();
		
		boolean vitaminStr = false;
		for (int i = 1; i <= num; i++) {
			int count = 0;
			
			for (int j = 0; j < i; j++) {
				if(str.charAt(j) != str.charAt(num - i + j)) {
                    count++;
                }
			}
			if(count == 1) {
				vitaminStr = true;
				break;
			}
		}
		System.out.println(vitaminStr ? "YES" : "NO");
	}
}
