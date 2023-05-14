package baekjoon;

import java.util.*;

public class ex259_그룹단어체커 {
	
	public static void main(String[] args){
    
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0; // 그룹 단어 개수
		
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			boolean check[] = new boolean[26]; // 알파벳 사용 했는지 안 했는지
			boolean temp = true; // 그룹 단어 인지
			
			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j)-'a';
				if(check[index]) { // 사용한 적이 있는 문자라면
					if(str.charAt(j) != str.charAt(j-1)) { // 이전 문자와 연속되지 않는다면
						temp = false; // 그룹 단어 x
						break;
					}
				}else { // 이전에 사용한적이 없는 문자라면
					check[index] = true; // 문자 사용 체크
				}
			}
			if(temp) { 
                count++;
            }
		}
		
		System.out.println(count);
	}
}
