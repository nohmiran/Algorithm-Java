package Baekjoon;

import java.util.*;

public class ex541_ISBN {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int result = 91;
        
        result += sc.nextInt();
        result += sc.nextInt() * 3;
        result += sc.nextInt();
        
        System.out.printf("The 1-3-sum is %d", result);
    }
}
