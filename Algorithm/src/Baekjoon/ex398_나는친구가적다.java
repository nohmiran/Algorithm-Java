package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class ex398_나는친구가적다 {

	public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String k = "";
		String keyword = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9))
				k += s.charAt(i);
		}
		System.out.println(k.indexOf(keyword) != -1 ? 1 : 0);
	}
}
