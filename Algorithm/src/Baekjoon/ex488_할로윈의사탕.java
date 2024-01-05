package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex488_할로윈의사탕 {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int candy = Integer.parseInt(st.nextToken());
			int brother = Integer.parseInt(st.nextToken());
			
			System.out.println("You get " + (candy / brother) + " piece(s) and your dad gets " + (candy % brother) + " piece(s).");
		}
	}
}
