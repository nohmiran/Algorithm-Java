package Baekjoon;

import java.util.*;

public class ex518_다면체 {
    
	public static void main(String[] args) {
        
		Scanner sc= new Scanner(System.in);
        
		int test = sc.nextInt();
		for(int i = 0; i < test; i++){
            int v = sc.nextInt();
            int e = sc.nextInt();

			System.out.println(2 - v + e);
        }
	}
}
