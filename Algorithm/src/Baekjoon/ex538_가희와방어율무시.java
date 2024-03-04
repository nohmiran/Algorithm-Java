package Baekjoon;

import java.util.Scanner;

public class ex538_가희와방어율무시 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
    int b = sc.nextInt();
        
    double temp = a - a * (1d * b / 100);

		if (temp >= 100) {
			System.out.println(0);
		} else
			System.out.println(1);
	}
}
