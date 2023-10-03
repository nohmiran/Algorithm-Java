package Baekjoon;

import java.util.*;

public class ex404_조별과제를하려는데조장이사라졌다 {
    
	public static void main(String[] args){
        
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num % 5 == 0) {
          System.out.println(num / 5);
        } else {
          System.out.println(num / 5 + 1);
        }
	}
}
