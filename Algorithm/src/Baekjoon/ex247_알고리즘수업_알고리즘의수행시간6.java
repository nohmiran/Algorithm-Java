package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex247_알고리즘수업_알고리즘의수행시간6 {
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long num = Long.parseLong(br.readLine());

		System.out.println(num * (num - 1) * (num - 2) / 6);
		System.out.println('3');
	}
}	
