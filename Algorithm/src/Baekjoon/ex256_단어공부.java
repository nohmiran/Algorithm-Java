package Baekjoon;

import java.util.Scanner;
 
public class ex256_단어공부 {
 
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
 
		int[] arr = new int[26];
		String str = sc.next();
 
		for (int i = 0; i < str.length(); i++){
 
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // A부터 Z까지
				arr[str.charAt(i) - 'A']++;
			}
    
			else {
				arr[str.charAt(i) - 'a']++; // a부터 z까지
			}
		}
 
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
                // 대문자로 바꾸기
				ch = (char) (i + 65);
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}
 
}
