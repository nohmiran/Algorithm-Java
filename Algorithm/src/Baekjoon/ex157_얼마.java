package Baekjoon;

import java.util.Scanner;

public class ex157_얼마 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt(); // test 개수
	    
	    for (int i = 0; i < test; ++i) {
	      int price = sc.nextInt(); // 자동차 가격
	      int option = sc.nextInt(); // 옵션의 개수
	      
	      for (int j = 0; j < option; ++j) {
	        int option2 = sc.nextInt(); // 해빈이가 사려고 하는 특정 옵션의 개수
	        int optionPrice = sc.nextInt(); // 해당 옵션의 가격
	        
	        price += option2 * optionPrice;
	      }
	      System.out.println(price);
	    }

	}

}
