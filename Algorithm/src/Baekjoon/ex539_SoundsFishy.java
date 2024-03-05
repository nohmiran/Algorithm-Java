package Baekjoon;

import java.util.Scanner;

public class ex539_SoundsFishy {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();

		if (num1 < num2 && num2 < num3 && num3 < num4) {
			System.out.println("Fish Rising");
		}else if(num1 > num2 && num2 > num3  && num3 > num4) {
			System.out.println("Fish Diving");
		}else if(num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("Fish At Constant Depth");
		}else {
			System.out.println("No Fish");
		}
	}
}
