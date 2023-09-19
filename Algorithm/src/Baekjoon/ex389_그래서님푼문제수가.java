package Baekjoon;

import java.io.*;
import java.util.*;

public class ex389_그래서님푼문제수가 {

	public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  StringBuilder sb = new StringBuilder();
	  StringTokenizer st = new StringTokenizer(br.readLine());
        
		int goal = Integer.parseInt(st.nextToken()); // 목표량
		int test = Integer.parseInt(st.nextToken()); // 하루에 푸는 문제
		int day = Integer.parseInt(st.nextToken()); // 며칠
		
    // 총 목표량을 달성하기 위해 하루에 몇 문제씩 며칠이 걸리는지.
		System.out.println((goal - test * day < 0 ?
                            0 
                            : goal - test * day) + " " + (goal - test * (day - 1) - 1));
	}
}
