package Baekjoon;

import java.util.Scanner;

public class ex141_뉴비의기준은뭘까 {
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        
	        if (b <= 2)
	            System.out.println("NEWBIE!");
	        else if (a < b)
	            System.out.println("TLE!");
	        else
	            System.out.println("OLDBIE!");
	    }

}
