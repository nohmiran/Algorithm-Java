package Baekjoon;

import java.util.Scanner;

public class ex325_농구경기 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int c = 0;
		int [] arr = new int[26];
        
		for(int i = 0; i < num; i++) { // 선수 이름 첫글자 구하기
			String name = sc.next(); 
			arr[name.charAt(0) - 'a']++;
		}
		for(int i = 0; i < 26; i++)
			if(arr[i] >= 5) { // 첫글자가 같은 선수 5명 구하기
				System.out.print((char)(i + 'a'));
				c++;
			}
		if(c == 0){ // 없스믄 따옴표 없이 PREDAJA 출력
			System.out.println("PREDAJA");
        }
    }
}
