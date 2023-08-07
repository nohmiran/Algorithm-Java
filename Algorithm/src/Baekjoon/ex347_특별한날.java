package Baekjoon;

import java.util.Scanner;

public class ex347_특별한날 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        String result = month == 2 && day == 18 ? "Special" 
                : month <= 2 && day < 18 || month == 1 ? "Before" 
                : "After";
        System.out.println(result);
    }
}
