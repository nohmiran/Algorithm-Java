package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex560_DKSH찾기 {

	public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer count = 0;
		for(int i = 0; i < str.length() - 3; i++) {
			String contents = str.substring(i, i + 4);
			if(contents.equals("DKSH")) {
                count++;
            }
		}
		System.out.println(count);
	}
}
