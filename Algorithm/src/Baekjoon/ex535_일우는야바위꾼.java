package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex535_일우는야바위꾼 {

    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
			if (a == x) {
				x = b;
			} else if (b == x) {
				x = a;
            }
		}
		System.out.println(x);
	}
}
