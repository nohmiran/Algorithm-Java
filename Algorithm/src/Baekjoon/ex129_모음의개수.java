package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex129_모음의개수 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // 한 글자씩 잘라버리고

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // 모음이 있으면
				count++; // count + 1
			}
		}

		bw.write(count + "");
		bw.flush();
	}
}
