package Baekjoon;

import java.util.*;
import java.io.*;

public class ex463_나무조각 {
    
	public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int[] n = new int[5];
		for (int i = 0; i < 5; i++) {
			n[i] = sc.nextInt();
		}

		while (true) {
			if (n[0] == 1 && n[1] == 2 && n[2] == 3 && n[3] == 4 && n[4] == 5) {
				break;
            }
			for (int i = 0; i < 4; i++) {
				if (n[i] > n[i + 1]) {
					int temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
					for (int j = 0; j < 5; j++) {
						sb.append(n[j] + " ");
					}
					sb.append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}
