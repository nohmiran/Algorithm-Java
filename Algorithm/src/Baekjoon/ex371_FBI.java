package Baekjoon;

import java.util.*;

public class ex371_FBI{
    
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];
        int count = 0;
        for(int i = 0; i < str.length; i++) {
        	str[i] = sc.next();
        }
        for(int i = 0; i < str.length; i++) { 
        	if(str[i].contains("FBI")) {
        		System.out.print(i + 1 + " ");
        		count++;
        	}
        }
        if(count == 0)
        	System.out.print("HE GOT AWAY!");
    }
}
