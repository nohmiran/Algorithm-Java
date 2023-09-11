package Baekjoon;

import java.util.*;

public class ex381_Strfry {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			char[] str1 = sc.next().toCharArray();
			char[] str2 = sc.next().toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			if (Arrays.compare(str1, str2) == 0) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		}
	}
}
