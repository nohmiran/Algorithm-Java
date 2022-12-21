package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex072_평균점수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
	        int sum = 0;
	        int score = 5;
	        for (int i = 0; i < score; i++) { // 5개 입력
	            int n = Integer.parseInt(br.readLine());
	           
	            if (n < 40) { // 40점보다 작으면 
	            	n = 40; // 40점으로
	            }
	            sum += n; // sum에 모든 점수를 더해주고
	        }
	        System.out.print(sum / score); // /5 를 하면 avg가 나온다.
	    }

	}