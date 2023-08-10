package Baekjoon;

import java.util.*;

public class ex350_YangjojangOfTheYear {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i = 0; i < test; i++) {
			int num = sc.nextInt();
			
				String[] school = new String[num];
				int[] drink = new int[num];
				for(int j = 0; j < num; j++) {
					school[j] = sc.next();
					drink[j] = sc.nextInt();
				}
				int max = drink[0];
				int idx = 0;
				for(int k = 0; k < drink.length; k++) {
					if(max < drink[k]) {
						max = drink[k];
						idx = k;
					}
				}
				System.out.println(school[idx]);		
		}		
	}
}
