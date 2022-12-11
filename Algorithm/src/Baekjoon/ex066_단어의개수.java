package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex066_단어의개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		System.out.println(st.countTokens()); // countTokens() : 토큰의 개수
	}

}
