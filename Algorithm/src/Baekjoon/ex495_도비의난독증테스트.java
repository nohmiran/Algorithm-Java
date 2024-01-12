package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex495_도비의난독증테스트 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> words = new ArrayList<>(); // 입력 받을 단어 list
		ArrayList<String> result = new ArrayList<>(); // 결과 저장할 list
        
		while(n != 0) {
			for(int i = 0; i < n; i++){
				words.add(sc.next());
            }
             // .CASE_INSENSITIVE_ORDER: 대소문자 구분없이 정렬
			Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
            
			result.add(words.get(0));// 첫 번째 단어 추가
			words.clear(); // 초기화
			n = sc.nextInt();
		}
		for(int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}
}
