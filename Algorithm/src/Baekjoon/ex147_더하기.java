package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex147_더하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), ",");

		int result = 0;

		while (st.hasMoreTokens()) {
		
			result += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(result);
		
		br.close();
	}

}
