package Baekjoon;

import java.util.Scanner;

public class ex134_별찍기7 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int num = sc.nextInt();

		    for(int i = 1; i <= num; i++) {
		      for(int j = i; j < num; j++) {
		        System.out.print(" ");
		      }
		      for(int k = 0; k < i*2-1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }

		    for(int i = 2 ; i <= num; i++) {
		      for(int j = 1; j < i; j++) {
		        System.out.print(" ");
		      }
		      for(int k = (2*num)-(i*2-1); k > 0; k--) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
	}

}
