package Baekjoon;

import java.util.Scanner;

public class ex464_자동완성 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner (System.in);
		
		String str = sc.next();
		
		if (str.equals("N") || str.equals("n")) {
			System.out.println("Naver D2");
		} else{
			System.out.println("Naver Whale");
	    }
    }
}
