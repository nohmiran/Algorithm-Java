package Barkjoon;

import java.util.Scanner;

public class ex321_숫자 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        
        if (num2 > num1) { 
            System.out.println(num2 - num1 - 1);
            for (long i = num1 + 1; i < num2; i++) {
                System.out.print(i + " ");
            }
        } else if (num1 > num2) { 
            System.out.println(num1 - num2 - 1);
            for (long i = num2 + 1; i < num1; i++) {
               System.out.print(i + " ");
            }
        }
        else System.out.print(0);
    }
}
