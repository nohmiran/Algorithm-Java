package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex128_세수정렬 {

	public static void main(String[] args) throws IOException {
		
		// 간단하게 스캐너 쓰고 싶지만 Arrays.sort를 쓰고 싶으니까 오랜만에 BufferedReader로 문자열을 입력받음.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 세자리 수를 오름차순으로 정렬할거니까 배열의 크기는 3개로 지정.
		int[] arr = new int[3];
		
		// 입력받은 수를 배열에 고대로 저장
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 오름차순 정렬
		Arrays.sort(arr); 
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
