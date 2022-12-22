package Baekjoon;

import java.util.Scanner;

public class ex130_카이사르암호 {

	public static void main(String[] args) {
		
//		변환전    A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//		변환후    D E F G H I J K L M N O P Q R S T U V W X Y Z A B C
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); // 입력
		char[] arr = new char[str.length()]; // 입력된 글자를 array에 하나씩 담아준당

		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) - 3 < 'A') { // ABC는 앞으로 3칸을 못땡기니까 +23을 해주고
				
				arr[i] = (char) (str.charAt(i) + 23); 
				
			} else { // 나머지 알파벳은 -3만큼 이동하게 돠주면 됨 낄낄
				
				arr[i] = (char) (str.charAt(i) - 3);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(arr[i]); // 출력쓰
		}
	}

}
