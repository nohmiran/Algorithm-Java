package Baekjoon;

import java.util.Scanner;

public class ex279_크로아티아알파벳 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
        
		String[] alph = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
		for(int i = 0; i < alph.length; i++) {
			if(word.contains(alph[i])) { 
                // .contains : 입력된 문자에 alph가 포함되어있는지
                // 포함되어 있으면 true, 아니면 false를 반환.
				word = word.replaceAll(alph[i], "1");
			}
		}
		System.out.println(word.length());
	}
}
