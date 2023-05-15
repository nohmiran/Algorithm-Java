package Baekjoon;

import java.util.*;

public class ex261_색종이{
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 색종이 개수
		int[][] arr = new int[100][100];
		
		int count = 0;
    
		for(int i = 0;i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int a=x; a < x + 10; a++) {
				for(int b=y; b < y + 10; b++) {
                    arr[a][b] = 1;
        }
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
                    count++;
        }
			}
		}
		System.out.println(count);
	}
}
