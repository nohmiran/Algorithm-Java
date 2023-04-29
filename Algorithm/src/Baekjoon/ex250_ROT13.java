package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex250_ROT13 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = br.readLine();
		StringBuilder sbResult = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {

			char ch = S.charAt(i);

			if ('a' <= ch && ch <= 'z' - 13) {
				ch = (char) (ch + 13);
			} else if ('z' - 13 <= ch && ch <= 'z') {
				ch = (char) (ch - 13);

			} else if ('A' <= ch && ch <= 'Z' - 13) {
				ch = (char) (ch + 13);

			} else if ('Z' - 13 <= ch && ch <= 'Z') {
				ch = (char) (ch - 13);
			}
			sbResult.append(ch);
		}
		bw.write(sbResult.toString());
		bw.flush();
		bw.close();
	}
}
