package Baekjoon;

import java.util.*;

public class ex281_세막대 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int[] arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		Arrays.sort(arr);
		
		if(arr[0] + arr[1] > arr[2]) {
			System.out.println(arr[0]+arr[1]+arr[2]);
		}else {
			System.out.println((arr[0] + arr[1]) * 2-1);
		}
	}
}
