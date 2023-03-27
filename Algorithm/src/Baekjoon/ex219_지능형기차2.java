package Baekjoon;

import java.util.Scanner;

public class ex219_지능형기차2 {
	
    public static void main(String[] args) {
    
    	Scanner sc = new Scanner(System.in);
        
    	int num = 0;
        int max = 0;
        
        for (int i = 0; i < 10; i++) {
            
            int out = sc.nextInt();
            int in = sc.nextInt();
            
            num -= out;
            num += in;
            
            if (num > max){
                max = num;
            } 
        }

        System.out.println(max);
    }
}
