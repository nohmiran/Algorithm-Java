package Beakjoon;

import java.util.Scanner;
 
public class ex263_직사각형에서탈출 {
 
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int x = sc.nextInt();
		int y = sc.nextInt();
		int width = sc.nextInt();
		int height = sc.nextInt();
        
		int x_min = Math.min(x, width - x); // x축 최소거리
		int y_min = Math.min(y, height - y); // y축 최소거리

		System.out.println(Math.min(x_min, y_min));
	}
}
