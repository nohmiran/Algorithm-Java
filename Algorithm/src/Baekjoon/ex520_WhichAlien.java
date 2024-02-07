package Baekjoon;

import java.util.*;

public class ex520_WhichAlien {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); // 안테나 수
        int num2 = sc.nextInt(); // 눈의 수

        if(num1 >= 3 && num2 <=4)
        	System.out.println("TroyMartian");
        if(num1 <= 6 && num2 >= 2)
        	System.out.println("VladSaturnian");
        if(num1 <= 2 && num2 <= 3)
        	System.out.println("GraemeMercurian");
    }
}
