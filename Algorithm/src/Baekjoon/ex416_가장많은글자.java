package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex416_가장많은글자 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[26];
		String str;

		while((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					arr[str.charAt(i) - 'a']++;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < 26; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < 26; i++) {
			if(max == arr[i]) {
				char result = (char) (i + 'a');
				bw.write(result);
			}
		}
		bw.flush();
		bw.close();
	}
}
