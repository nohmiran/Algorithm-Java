package Baekjoon;

import java.util.*;

public class ex551_Tri-du {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a == b ? a : Math.max(a, b));
    }
}
