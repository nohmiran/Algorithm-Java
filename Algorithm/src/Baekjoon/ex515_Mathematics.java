package Baekjoon;

import java.util.Scanner;

public class ex515_Mathematics {
    
	 public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int result = 0;
         
        while(n-- > 0) {
            result += sc.nextInt();
        }
        System.out.println(result);
    }
}
